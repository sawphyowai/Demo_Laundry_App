package com.example.laundry_demo.compoment

import android.util.Log.d
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.R
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.enums.WashingStatus
import com.example.laundry_demo.orderdetail.OrderDetailState

@Composable
fun OrderDerailBody(
    modifier: Modifier =Modifier,
    washingStatus: WashingStatus
    ) {
    Column(
        modifier = modifier.padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(
            modifier = Modifier.size(200.dp),
            imageVector = ImageVector.vectorResource(id =imageStatus(washingStatus) ),
            contentDescription = null,
            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary)
            )

        Text(
            text = "Your clothes are still ${washingStatus.label}. will be finished soon.",
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
            )
    }
}

fun imageStatus(washingStatus: WashingStatus):Int=when(washingStatus){
    is WashingStatus.Washing ->{
        d("OKOK_Value","1")
        R.drawable.ic_washing
    }
    is WashingStatus.Cleaning ->{
        d("OKOK_Value","2")
        R.drawable.ic_cleaning
    }

    is WashingStatus.Drying->{
        d("OKOK_Value","3")
        R.drawable.ic_drying
    }

    is WashingStatus.Delivery ->{
        d("OKOK_Value","4")
        R.drawable.ic_bicycle
    }

}

@Preview
@Composable
fun OrderDerailBodyPreview() {
    Laundry_demoTheme {
        OrderDerailBody(
            modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.surface),
            washingStatus = OrderDetailState.idle().list[1]
        )
    }
}