package com.example.laundry_demo.compoment

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaymentTopAppHeader(
    modifier: Modifier=Modifier,
    onNavigateToCheckOut:() -> Unit,
    onOverFlowMenu:() -> Unit
     ) {
    val shape=MaterialTheme.shapes.small
    val border= BorderStroke(2.dp, Color.White)
    val color= IconButtonDefaults.outlinedIconButtonColors(
        containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.05f)
    )

    CenterAlignedTopAppBar(
        title = {
            Text(text = "CheckOut")
        },
        modifier = modifier.background(color=MaterialTheme.colorScheme.primary.copy(alpha = 0.01f)),
        navigationIcon = {
            OutlinedIconButton(
                onClick = onNavigateToCheckOut,
                shape = shape,
                border = border,
                colors = color
                ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription =null )  
            }
         
        },
        actions = {
            OutlinedIconButton(
                onClick = onOverFlowMenu,
                shape=shape,
                border=border,
                colors=color
                ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription =null )    
            }
        }
    )
}

@Preview
@Composable
fun PaymentScreenHeaderPreview() {
    Laundry_demoTheme {
        PaymentTopAppHeader(
            modifier = Modifier,
            onNavigateToCheckOut = {},
            onOverFlowMenu={}
        )
    }
}