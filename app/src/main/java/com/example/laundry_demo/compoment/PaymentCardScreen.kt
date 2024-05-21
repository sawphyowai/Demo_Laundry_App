package com.example.laundry_demo.compoment

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.compoment.itemcompoment.LaundryPaymentItem
import com.example.laundry_demo.payment.PaymentState

@Composable
fun PaymentCardScreen(
    modifier:Modifier=Modifier,
    onAddNewMethod:()->Unit={},
    content:@Composable () -> Unit,
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        content.invoke()
        TextButton(onClick = onAddNewMethod) {
           Text(
               text = stringResource(id = R.string.AddNewMethod),
               textDecoration = TextDecoration.Underline
               )
        }
    }
}

@Preview
@Composable
fun PaymentCardScreenPreview() {
    Laundry_demoTheme {
        LazyColumn(){
            val size=PaymentState().paymentList.size
            item {
                PaymentCardScreen(
                    modifier= Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .background(color = MaterialTheme.colorScheme.surface),
                    content = {
                        PaymentState().paymentList.forEachIndexed { index, paymentDataVO ->
                            LaundryPaymentItem(
                                paymentDataVO=paymentDataVO,
                                isCheck = {}
                                )

                            if(index >=0  &&  index < size-1){
                                Divider(
                                    modifier = Modifier.padding(
                                        vertical = 5.dp,
                                        horizontal = 15.dp
                                    )
                                )
                            }
                        }
                    }
                )
            }
        }

    }
}