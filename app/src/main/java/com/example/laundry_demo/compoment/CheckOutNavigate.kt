package com.example.laundry_demo.compoment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R

@Composable
fun CheckOutNavigation(
    modifier: Modifier = Modifier,
    onCheckOut:() -> Unit
    ) {
    Card(
        modifier= Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.large,
        colors =  CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
        ) {
        Column(modifier=modifier.background(color = Color.Transparent)) {
            Row(
                modifier = Modifier.padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    modifier=Modifier.size(50.dp),
                    painter = painterResource(id = R.drawable.ic_laundry_service),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Column(
                    modifier=Modifier.weight(2f),
                ){
                    Text(text = stringResource(id = R.string.totalItem))
                    Text(
                        text = "5 Items",
                        fontWeight = FontWeight.Medium,
                        fontSize = 24.sp
                    )

                }

                Column(
                ){
                    Text(text = "Coast")
                    Text(
                        text = "$${2.5}",
                        fontWeight = FontWeight.Medium,
                        fontSize = 24.sp
                    )

                }

            }
            LaundryButton(
                modifier = Modifier.fillMaxWidth(),
                label = "CheckOut",
                isCheckReverse=true,
                onClick = onCheckOut
            )
        }

    }
}

@Preview
@Composable
fun CheckOutNavigationPreview() {
    Laundry_demoTheme {
        CheckOutNavigation(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.surface),
            onCheckOut = {}
        )
    }
}