package com.example.laundry_demo.compoment

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderDetailTopAdapter(
    navigatedToBack:() -> Unit
) {
    val shape=MaterialTheme.shapes.medium
    val border= BorderStroke(1.dp, Color.Gray)
    val color=IconButtonDefaults.outlinedIconButtonColors(
        containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.05f)
    )
    CenterAlignedTopAppBar(
        navigationIcon = {
          OutlinedIconButton(
              onClick = navigatedToBack,
              shape = shape,
              colors = color,
              border = border
              ) {
              Icon(
                  imageVector = Icons.Default.ArrowBack,
                  contentDescription = null,
                  tint = Color.Black
                  )
          }
        },
        title = {
          Text(text = "Order Detail" )
        },
        actions = {
            OutlinedIconButton(
                onClick = { },
                shape=shape,
                colors = color,
                border = border
                ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = null,
                    tint = Color.Black
                    
                    )
            }
        }
        )
}

@Preview
@Composable
fun OrderDetailTopAdapterPreview() {
    Laundry_demoTheme {
        OrderDetailTopAdapter({})
    }
}