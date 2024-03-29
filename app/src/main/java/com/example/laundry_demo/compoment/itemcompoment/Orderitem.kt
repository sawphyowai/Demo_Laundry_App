package com.example.laundry_demo.compoment.itemcompoment

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.detailscreen.CheckOutDataVO

@Composable
fun OrderItem(
    modifier:Modifier=Modifier,
    item:CheckOutDataVO,
    onAddListener:(item:CheckOutDataVO) -> Unit={},
    onRemoveListener:(tem:CheckOutDataVO) -> Unit={}
    ) {
    Card (
        modifier = modifier.padding(5.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 1.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
        ){
        Row(
            modifier=Modifier
                .padding(10.dp)
                .background(color = Color.Transparent),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Image(
                painter = painterResource(id=R.drawable.placeholder_laundry_machine),
                contentDescription = null,
                modifier= Modifier
                    .clip(CircleShape)
                    .size(50.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier= Modifier.weight(1f)
            ) {
                Text(
                    text = item.name,
                    fontWeight = FontWeight.Medium
                    )
                Text(
                    text = "$${item.price}"
                )
            }

            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(0.5f)
            ){
                OutlinedIconButton(
                    onClick = {
                        onRemoveListener(item)
                              },
                    modifier = Modifier.size(30.dp),
                    border = BorderStroke(1.dp, Color.Gray),

                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_remove),
                        contentDescription =null )
                }

                Text(
                    text = item.value.toString(),
                    fontSize = 18.sp)

                OutlinedIconButton(
                    onClick = {
                        onAddListener(item)
                    },
                    modifier = Modifier.size(30.dp),
                    border = BorderStroke(1.dp, Color.Gray)

                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription =null )
                }
            }


        }
    }

}

@Preview
@Composable
fun OrderItemPreview() {
    Laundry_demoTheme {
        OrderItem(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(color = MaterialTheme.colorScheme.surface),
            item = CheckOutDataVO.idle()
        )
    }
}