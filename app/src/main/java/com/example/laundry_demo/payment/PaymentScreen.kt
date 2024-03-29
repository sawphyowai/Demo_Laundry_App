package com.example.laundry_demo.payment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.compoment.CheckOutService
import com.example.laundry_demo.compoment.LaundryButton
import com.example.laundry_demo.compoment.PaymentCardScreen
import com.example.laundry_demo.compoment.PaymentTopAppHeader
import com.example.laundry_demo.compoment.itemcompoment.LaundryPaymentItem
import com.example.laundry_demo.presenter.PaymentViewModel
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.repository.splash.PaymentNavigatorImpl

@Composable
fun PaymentScreen(
    modifier: Modifier = Modifier,
    paymentViewModel: PaymentViewModel) {

    val paymentState by remember {
        paymentViewModel.paymentState
    }

    PaymentScreenStateLess(
        paymentState,
        paymentViewModel::onCheckSelfPayment,
        paymentViewModel::onCheckDeliveryService,
        paymentViewModel::onCheckPaymentMethod,
        paymentViewModel::navigateToPaymentSuccess,
        paymentViewModel::navigateToBack
    )
}

@Composable
fun PaymentScreenStateLess(
    paymentState: PaymentState,
    onCheckSelfPayment: () -> Unit,
    onCheckDeliveryService: () -> Unit,
    onCheckPaymentMethod: (PaymentDataVO) -> Unit,
    navigateToPaymentSuccess: () -> Unit,
    navigateToBack: () -> Unit,
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.2f),
        topBar = {
            PaymentTopAppHeader(
                onNavigateToCheckOut=navigateToBack,
                onOverFlowMenu={}
            )
        },
        bottomBar = {
            LaundryButton(
                    modifier = Modifier.fillMaxWidth().padding(10.dp),
                    label = stringResource(id = R.string.payAmount),
                    isCheckReverse=true,
                    onClick =navigateToPaymentSuccess
                )
        }

    ) {value->
        LazyColumn(
            modifier = Modifier
                .padding(value)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ){
            
            item {
                CheckOutService(
                    paymentState=paymentState,
                    onCheckSelfPayment=onCheckSelfPayment,
                    onCheckDeliveryService=onCheckDeliveryService
                    )
            }

            item{
                Text(
                    text = "Payment Method",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                    )
            }
            item{
                PaymentCardScreen {
                    val size=paymentState.paymentList.size
                    paymentState.paymentList.forEachIndexed { index, paymentDataVO ->
                        LaundryPaymentItem(
                            paymentDataVO = paymentDataVO,
                            isCheck = onCheckPaymentMethod)

                        if(index >=0 && index < size-1){
                            Divider(
                                modifier = Modifier.padding(
                                    vertical = 15.dp,
                                    horizontal = 5.dp
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PaymentScreenPreview() {
    Laundry_demoTheme {
        PaymentScreen(
            paymentViewModel = PaymentViewModel(
                paymentNavigator = PaymentNavigatorImpl()
            ))
    }
}