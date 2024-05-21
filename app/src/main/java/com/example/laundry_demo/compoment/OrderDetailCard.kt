package com.example.laundry_demo.compoment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.orderdetail.OrderDetailDataVO
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R

@Composable
fun ColumnScope.OrderDetailCard(
    modifier: Modifier=Modifier,
    item: OrderDetailDataVO
) {
    
    Row(
        modifier = modifier
    ){
        Text(
            modifier = Modifier.weight(1f),
            text = "@${item.id}",
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp
            )
        OrderStateStatus(false)
    }

    OrderDetailItem(
        label = stringResource(id = R.string.lb_laundry_in),
        value = item.changeDateFormat()
        )

    OrderDetailItem(
        label = stringResource(id = R.string.lb_Delivery),
        value = item.address
    )

    OrderDetailItem(
        label = stringResource(id = R.string.lb_Estimate_Time),
        value = item.estimate
    )

}


@Preview
@Composable
fun OrderDetailCardPreview() {
    Laundry_demoTheme {
        Column {
            OrderDetailCard(
                modifier= Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.surface),
                item= OrderDetailDataVO.idle()

            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderStateStatus(status:Boolean) {
    Badge(
        modifier = Modifier,
        containerColor = Color(if(status) 0xFF61e7be else 0xFFfdc944)
    ) {
        Text(
            text = if(status) "complete" else "ongoing",
            color = MaterialTheme.colorScheme.surface,
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
            )
    }
}


@Composable
fun OrderDetailItem(
    label:String,value:String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(10.dp)
    ){
        Text(
            text = label,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.weight(1f)
            )
        Text(
            text = value,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.weight(0.5f)
            )
    }
}

@Preview
@Composable
fun OrderDetailItemPreview() {
    Laundry_demoTheme {
        OrderDetailItem(
            label = "Laundry in",
            value = "05:57 pm"
            )
    }
}

@Preview
@Composable
fun OrderStateStatusPreview() {
    Laundry_demoTheme {
        OrderStateStatus(true)
    }
}

