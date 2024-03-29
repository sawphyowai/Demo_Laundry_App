package com.example.laundry_demo.compoment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R

@Composable
fun ColumnScope.DetailPageBody(modifier: Modifier=Modifier) {
    Text(
        text = stringResource(id = R.string.laundry),
        fontWeight = FontWeight.Medium,
        fontSize = 30.sp
    )

    Row(){
        LaundryCard(
            modifier=modifier.weight(1f),
            imageVector = Icons.Default.LocationOn,
            label = stringResource(id = R.string.location),
            tintColor = MaterialTheme.colorScheme.primary)

        LaundryCard(
            modifier=modifier.weight(1f),
            imageVector = Icons.Default.Star,
            label = stringResource(id = R.string.review),
            tintColor = Color.Yellow
        )

    }
}

@Preview
@Composable
fun DetailPageBodyPreview() {
    Laundry_demoTheme {
        Column {
            DetailPageBody(
                modifier =
                Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.surface)
            )
        }

    }
}


