package com.example.laundry_demo.compoment.itemcompoment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.compoment.OrderStateStatus
import com.example.laundry_demo.enums.LaundryStatus
import com.example.laundry_demo.enums.WashingStatus
import com.example.laundry_demo.history.HistoryDataVO
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@Composable
fun HistoryItem(
    modifier:Modifier=Modifier,
    item:HistoryDataVO
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(shape = RoundedCornerShape(20.dp))
            .background(color = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f))
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)

    ) {

        Row(){
            Column(
                modifier= Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(
                    text =item.name,
                    fontWeight = FontWeight.Medium
                    )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = item.changeDateFormat(),
                    style = MaterialTheme.typography.headlineSmall.copy(color = Color.Gray),
                    fontSize = 13.sp
                    )

            }
            OrderStateStatus(true)
        }

        Divider(modifier = Modifier.height(1.dp))

        HistoryProgress(item.washingStatus,modifier=Modifier.fillMaxWidth())

    }
}


@Composable
fun HistoryProgress(selectWashing: WashingStatus,modifier: Modifier=Modifier) {
    val allWashingStatus= mutableListOf(
        WashingStatus.Washing(
            status=LaundryStatus.NotStart,
            name = "Washing"
        ),
        WashingStatus.Washing(
            status=LaundryStatus.NotStart,
            name = "Cleaning"
        ),
        WashingStatus.Washing(
            status=LaundryStatus.NotStart,
            name = "Drying"
        ),
        WashingStatus.Washing(
            status=LaundryStatus.NotStart,
            name = "Deliver"
        )
    )
    val temp=allWashingStatus.toMutableList()
    temp.clear()
    when(selectWashing){
        is WashingStatus.Washing ->{
            temp.addAll(
                listOf(
                WashingStatus.Washing(
                    status=LaundryStatus.Continue,
                    name = "Washing"
                ),
                WashingStatus.Washing(
                    status=LaundryStatus.NotStart,
                    name = "Cleaning"
                ),
                WashingStatus.Washing(
                    status=LaundryStatus.NotStart,
                    name = "Drying"
                ),
                WashingStatus.Washing(
                    status=LaundryStatus.NotStart,
                    name = "Deliver"
                )
                )
            )
        }

        is WashingStatus.Cleaning ->{
            temp.addAll(
                listOf(
                    WashingStatus.Washing(
                        status=LaundryStatus.Start,
                        name = "Washing"
                    ),
                    WashingStatus.Washing(
                        status=LaundryStatus.Continue,
                        name = "Cleaning"
                    ),
                    WashingStatus.Washing(
                        status=LaundryStatus.NotStart,
                        name = "Drying"
                    ),
                    WashingStatus.Washing(
                        status=LaundryStatus.NotStart,
                        name = "Deliver"
                    )
                )
            )
        }

        is WashingStatus.Drying ->{
            temp.addAll(
                listOf(
                    WashingStatus.Washing(
                        status=LaundryStatus.Start,
                        name = "Washing"
                    ),
                    WashingStatus.Washing(
                        status=LaundryStatus.Start,
                        name = "Cleaning"
                    ),
                    WashingStatus.Washing(
                        status=LaundryStatus.Continue,
                        name = "Drying"
                    ),
                    WashingStatus.Washing(
                        status=LaundryStatus.NotStart,
                        name = "Deliver"
                    )
                )
            )
        }

        is WashingStatus.Delivery ->{
            temp.addAll(
                listOf(
                    WashingStatus.Washing(
                        status=LaundryStatus.Start,
                        name = "Washing"
                    ),
                    WashingStatus.Washing(
                        status=LaundryStatus.Start,
                        name = "Cleaning"
                    ),
                    WashingStatus.Washing(
                        status=LaundryStatus.Start,
                        name = "Drying"
                    ),
                    WashingStatus.Washing(
                        status=if(selectWashing.laundryStatus!=LaundryStatus.Finish) LaundryStatus.Finish else LaundryStatus.Continue,
                        name = "Deliver"
                    )
                )
            )
        }

    }
    allWashingStatus.clear()
    allWashingStatus.addAll(temp)
    val length=allWashingStatus.size
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        allWashingStatus.forEachIndexed { index, item ->
            HistoryStatus(item)
            if(index>=0 && index < length-1){
                Spacer(modifier = Modifier.width(5.dp))
            }
        }
    }

}

@Composable
fun HistoryStatus(item: WashingStatus) {
    val circle= Modifier
        .clip(CircleShape)
        .size(20.dp)
        .clip(CircleShape)
        .background(color = MaterialTheme.colorScheme.primary)

    val finishStatus=item.laundryStatus

    Row(
        verticalAlignment = Alignment.CenterVertically,
    ){
        when(finishStatus){
            LaundryStatus.Finish,LaundryStatus.Start ->{
                Box(modifier = circle)
            }
            LaundryStatus.Continue ->{
                Box(modifier = circle){
                    Box(modifier = circle
                        .size(7.dp)
                        .background(color = MaterialTheme.colorScheme.surface)
                    )

                }

            }
            LaundryStatus.NotStart->{
                Box(
                    modifier = circle.background(Color.Gray)
                )
            }
        }
        Spacer(modifier = Modifier.width(5.dp))

        Text(
            text = item.label,
            fontSize = 12.sp
            )
    }
}

@Preview
@Composable
fun HistoryProgressPreview() {
    Laundry_demoTheme {
        HistoryProgress(
            selectWashing=WashingStatus.Cleaning(
                LaundryStatus.Continue,
                name = "Cleaning"
            ),
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.surface)
        )
    }
}


@Preview
@Composable
fun HistoryItemPreview() {
    Laundry_demoTheme {
        HistoryItem(
            modifier=Modifier
                .background(color=MaterialTheme.colorScheme.surface)
            ,
            item = HistoryDataVO.idle()
            )
    }
}