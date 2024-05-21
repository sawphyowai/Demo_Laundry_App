package com.example.laundry_demo.detailscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.R
import com.example.laundry_demo.compoment.CheckOutNavigation
import com.example.laundry_demo.compoment.DetailPageBody
import com.example.laundry_demo.compoment.DetailTopAdapter
import com.example.laundry_demo.compoment.itemcompoment.OrderItem
import com.example.laundry_demo.presenter.CheckOutViewModel
import com.example.laundry_demo.repository.splash.CheckoutImpl
import com.example.laundry_demo.ui.theme.Laundry_demoTheme


@Composable
fun CheckOutScreen(
    modifier: Modifier = Modifier,
    viewModel: CheckOutViewModel
) {

    val detailState by remember {
        viewModel.checkOutState
    }
    CheckOutScreenStateLess(
        Modifier,
        detailState,
        viewModel::onAddListener,
        viewModel::onRemoveListener,
        viewModel::navigateToPayment,
        viewModel::navigateToBack
        )
}

@Composable
fun CheckOutScreenStateLess(
    modifier: Modifier,
    checkOutState: CheckOutState,
    onAddListener: (CheckOutDataVO) -> Unit,
    onRemoveListener: (CheckOutDataVO) -> Unit,
    onCheckOutNavigation: () -> Unit,
    navigateToBack: () -> Unit
) {

    Scaffold (
        topBar = {
            DetailTopAdapter(
                goToNavigate=navigateToBack,
                goToOverFlow={}
                )
        },
        modifier = Modifier.fillMaxWidth(),
        bottomBar = {
            CheckOutNavigation(
                modifier = Modifier.padding(10.dp),
                onCheckOut = onCheckOutNavigation
                )
        }
    ){value->
        Column(
            modifier = Modifier
                .padding(value),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ){

            DetailPageBody(modifier = Modifier.padding(horizontal = 10.dp))

            Image(
                modifier= Modifier
                    .height(200.dp)
                    .padding(horizontal = 10.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.placeholder_laundry_machine),
                contentDescription = null
            )

            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(400.dp)
                ,
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.2f)
                )
            ) {
                Row(modifier= Modifier
                    .padding(vertical = 10.dp)
                    .padding(8.dp)
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){

                    Text(
                        text = stringResource(id = R.string.orderList),
                        modifier = Modifier.weight(1f),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    TextButton(
                        onClick = { /*TODO*/ }) {
                        Text(
                            text = stringResource(id = R.string.addCategory),
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.primary
                        )
                        
                    }
                }

                LazyColumn(){
                    items(checkOutState.orderList){ item->
                        OrderItem(
                            item = item,
                            onAddListener=onAddListener,
                            onRemoveListener = onRemoveListener
                            )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DetailAllListScreenPreview() {
    Laundry_demoTheme {
        CheckOutScreen(
            viewModel = CheckOutViewModel(
                checkoutNavigator = CheckoutImpl()
            ))
    }
}