package com.example.laundry_demo.compoment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@Composable
fun LaundryCard(
    modifier: Modifier=Modifier,
    imageVector: ImageVector,
    label:String,
    tintColor:Color
    ) {
    Card(
        modifier=modifier.height(40.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation=1.dp
        ),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        shape = MaterialTheme.shapes.small
        ) {
        Row (
            modifier= Modifier
                .padding(8.dp)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
            ){

            Icon(
                imageVector = imageVector,
                contentDescription =null,
                tint = tintColor
                )
            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = label,
                overflow = TextOverflow.Ellipsis
                )
        }
    }
}

@Preview
@Composable
fun LaundryCardPreview() {
    Laundry_demoTheme {
        LaundryCard(
            modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.background),
            imageVector = Icons.Default.LocationOn,
            label="Bankok.Thailand",
            tintColor=MaterialTheme.colorScheme.primary
            )
    }
}