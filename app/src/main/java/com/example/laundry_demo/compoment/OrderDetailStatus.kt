package com.example.laundry_demo.compoment

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.enums.LaundryStatus
import com.example.laundry_demo.enums.WashingStatus
import com.example.laundry_demo.orderdetail.OrderDetailState
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@Composable
fun OrderDetailProgress(
    modifier: Modifier=Modifier,
    status: List<WashingStatus>) {

    val primaryColor = MaterialTheme.colorScheme.primary
    val surfaceColor = MaterialTheme.colorScheme.surface
        Row(modifier =
        modifier
            .padding(10.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            status.forEach {item->
                val isFinish=item.laundryStatus==LaundryStatus.Finish
                val isNotStart=item.laundryStatus==LaundryStatus.NotStart
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier=Modifier.size(50.dp).clip(CircleShape)
                            .border(1.dp,
                        if(isNotStart) Color.LightGray else primaryColor,
                            CircleShape)
                            .background(if(isFinish) primaryColor else Color.Transparent ),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            modifier = Modifier.size(40.dp),
                            imageVector = if(isFinish) Icons.Default.Check
                                    else ImageVector.vectorResource(id = imageStatus(item)),
                            contentDescription = null,
                            tint = if (isNotStart) Color.LightGray else if (isFinish) surfaceColor else primaryColor
                        )
                        Spacer(modifier = Modifier.height(10.dp))

                    }

                    Text(
                        text = item.label,
                        fontWeight = FontWeight.Medium
                    )

                }
            }

    }

}

@Preview
@Composable
fun OrderDetailProgressPreview() {
    Laundry_demoTheme {
        OrderDetailProgress(
            modifier= Modifier
                .fillMaxWidth()
                .wrapContentWidth()
                .background(color = MaterialTheme.colorScheme.surface),
            OrderDetailState.idle().list
        )
    }
}