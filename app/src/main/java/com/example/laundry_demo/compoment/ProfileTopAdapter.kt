package com.example.laundry_demo.compoment

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileTopAdapter(modifier: Modifier=Modifier) {
    TopAppBar(title = {
        Text(
            text = "Profile",
            fontWeight = FontWeight.Medium,
            )
    },
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent
        )
        )
}

@Preview
@Composable
fun ProfileTopAdapterPreview() {
    Laundry_demoTheme {
        ProfileTopAdapter()
    }
}