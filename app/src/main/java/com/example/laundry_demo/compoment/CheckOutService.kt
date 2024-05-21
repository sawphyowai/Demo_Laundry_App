package com.example.laundry_demo.compoment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.payment.PaymentState
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@Composable
fun CheckOutService(
    paymentState: PaymentState,
    modifier: Modifier = Modifier,
    onCheckSelfPayment: () -> Unit,
    onCheckDeliveryService: () -> Unit
) {
    Column(
        modifier= modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(10.dp))
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(8.dp),
        ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            RadioButton(selected = paymentState.isCheckService,
                onClick = onCheckSelfPayment
                )
            Text(
                text = "Self Service",
                fontWeight = FontWeight.Medium
            )
        }
        Divider(modifier=Modifier.height(1.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            RadioButton(selected = paymentState.isCheckDeliveryService,
                onClick = onCheckDeliveryService
            )
            Column (
                modifier = Modifier.fillMaxWidth().wrapContentHeight()
                ){
                Text(
                    text = "Deli Service",
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "LaMin Condo,Hlaing Burma",
                    fontWeight = FontWeight.Normal
                )
                TextButton(
                    onClick = { /*TODO*/ },
                    modifier=Modifier.align(Alignment.End)
                    ) {
                    Text(
                        text = "Edit Address",
                        textDecoration = TextDecoration.Underline
                        )
                }
            }
        }
    }
}

@Preview
@Composable
fun CheckOutServicePreview() {
    Laundry_demoTheme {
        CheckOutService(
            paymentState = PaymentState(),
            modifier =
            Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.surface),
            onCheckSelfPayment = {},
            onCheckDeliveryService = {}
        )
    }
}