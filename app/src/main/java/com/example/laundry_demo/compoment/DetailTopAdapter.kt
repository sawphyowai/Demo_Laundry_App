package com.example.laundry_demo.compoment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailTopAdapter(
    modifier: Modifier=Modifier,
    goToNavigate :() -> Unit={},
    goToOverFlow :() -> Unit={}
    ) {
    TopAppBar(
        title = {
           
        },
        navigationIcon = {
        IconButton(onClick = goToNavigate) {
            Icon(
                imageVector = Icons.Default.ArrowBack ,
                contentDescription = null,
            )
        }
        },
        actions = {
             IconButton(onClick = goToOverFlow) {
                 Icon(
                     imageVector = Icons.Default.MoreVert ,
                     contentDescription = null,
                 )
             }
        },
        modifier = modifier
        )
}

@Preview
@Composable
fun DetailTopAdapterPreview() {
    Laundry_demoTheme {
        DetailTopAdapter()
    }
}