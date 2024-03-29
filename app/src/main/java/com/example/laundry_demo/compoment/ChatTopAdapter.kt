package com.example.laundry_demo.compoment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatTopAdapter(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(text = stringResource(id =R.string.chat ))
        },
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent
        )
        )
}

@Preview
@Composable
fun ChatTopAdapterPreview() {
    Laundry_demoTheme {
        ChatTopAdapter(
            modifier = Modifier.fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.surface)
        )
    }
}