package com.example.laundry_demo.compoment

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HistoryTopAdapter(modifier:Modifier=Modifier) {
    TopAppBar(title = {
      Text(
          text = stringResource(id = R.string.lb_chat),
          fontWeight = FontWeight.Bold
          )
    })
}
@Preview
@Composable
fun HistoryTopAdapterPreview() {
    Laundry_demoTheme {
        HistoryTopAdapter()
    }
}