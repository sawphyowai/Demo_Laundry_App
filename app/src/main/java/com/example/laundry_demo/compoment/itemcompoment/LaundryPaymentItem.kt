package com.example.laundry_demo.compoment.itemcompoment

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.payment.PaymentDataVO
import com.example.laundry_demo.payment.PaymentState

@Composable
fun LaundryPaymentItem(
    modifier: Modifier=Modifier,
    paymentDataVO: PaymentDataVO,
    isCheck:(item:PaymentDataVO) -> Unit
    ) {
    Row(
        modifier=modifier
            .padding(5.dp)
        ,
        verticalAlignment = Alignment.CenterVertically
    ){
       Image(
           modifier = Modifier
               .size(50.dp)
               .clip(CircleShape)
               .background(color = Color.Gray.copy(alpha = 0.5f)),
           painter = painterResource(id = paymentDataVO.image),
           contentDescription = null,
           contentScale = ContentScale.Inside
           )

        Text(
            text = paymentDataVO.name,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .weight(1f)
                .padding(start = 10.dp)
            )

        RadioButton(selected = paymentDataVO.isCheck, onClick = { isCheck(paymentDataVO) })
    }
}


@Preview
@Composable
fun LaundryPaymentItemListPreview() {
    Laundry_demoTheme {
        LazyColumn(){
            items(PaymentState().paymentList){items->
                LaundryPaymentItem(
                    modifier = Modifier.fillMaxWidth()
                        .wrapContentHeight()
                        .background(color = MaterialTheme.colorScheme.surface),
                    paymentDataVO=items,
                    isCheck = {}
                )
            }
        }
    }
}