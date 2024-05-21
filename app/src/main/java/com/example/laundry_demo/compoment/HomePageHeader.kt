package com.example.laundry_demo.compoment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.R
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopAppBar(modifier: Modifier) {
    TopAppBar(
        modifier=modifier.padding(10.dp),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent)
        ,title = {
        Column(modifier) {
            Text(
                text = stringResource(id = R.string.currentLocation),
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
              Icon(
                  imageVector = Icons.Default.Place,
                  contentDescription = null,
                  tint = MaterialTheme.colorScheme.primary,
                  )

                Spacer(modifier = Modifier.width(5.dp))
                
                Text(
                    text = stringResource(id = R.string.location),
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp
                    )
            }
        }
    },
        actions = {
            OutlinedIconButton(
                onClick = {

            },
                shape = MaterialTheme.shapes.medium
                ) {
                Icon(imageVector =
                    Icons.Default.Notifications
                    ,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                    )
            }
        }
    )

}

@Preview
@Composable
fun HomePagerHeaderPreview() {
    Laundry_demoTheme {
        HomeTopAppBar(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.surface)
        )
    }
}

@Composable
fun LaundryCardView(modifier: Modifier=Modifier,onChangeDetail:()->Unit) {
  Card (
      modifier=modifier.padding(vertical = 10.dp),
      colors = CardDefaults.cardColors(
          containerColor = MaterialTheme.colorScheme.primary
      ),
      shape = MaterialTheme.shapes.medium,
      elevation=CardDefaults.cardElevation(
          defaultElevation=0.5.dp
      )
  ){
      Column (
          modifier = modifier.padding(10.dp)
      ){
          Text(text = stringResource(id = R.string.laundryName),
              fontWeight = FontWeight.Medium,
              color = MaterialTheme.colorScheme.surface)

          Row(){
              Text(
                  modifier = Modifier.weight(2f),
                  text = stringResource(id = R.string.process) ,
                  fontWeight = FontWeight.ExtraBold,
                  fontSize = 20.sp,
                  lineHeight = 30.sp,
                  color = MaterialTheme.colorScheme.surface
              )

              Image(
                  imageVector = ImageVector.vectorResource(id = R.drawable.ic_laundry_service),
                  contentDescription =null,
                  Modifier.weight(0.5f),
                  contentScale = ContentScale.Fit,
                  colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.surface))
          }

          TextButton(onClick = onChangeDetail) {
              Text(
                  text = stringResource(id = R.string.viewDetail),
                  color = MaterialTheme.colorScheme.surface,
                  fontSize = 15.sp
                  )
          }
      }
  }
}

@Preview
@Composable
fun LaundryCardViewPreview() {
    Laundry_demoTheme {
        LaundryCardView(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            {}
        )
    }
}