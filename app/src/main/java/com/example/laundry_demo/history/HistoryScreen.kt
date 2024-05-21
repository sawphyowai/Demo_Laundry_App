package com.example.laundry_demo.history

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.laundry_demo.compoment.HistoryTopAdapter
import com.example.laundry_demo.compoment.itemcompoment.HistoryItem
import com.example.laundry_demo.presenter.HistoryViewModel
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R

@Composable
fun HistoryScreen() {
   val viewModel:HistoryViewModel= viewModel()
    val historyState by remember{
        viewModel.historyState
    }
    Crossfade(targetState = historyState.historyList.isNotEmpty()) {value->
        if(value){
            HistoryScreenStateLess(historyState)
        }else{
            EmptyHistoryScreen()

        }
    }
}

@Composable
fun HistoryScreenStateLess(historyState: HistoryState) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            HistoryTopAdapter()
        }
    ) {value->
        LazyColumn(
            modifier = Modifier.padding(value)
        ){
            items(historyState.historyList){item->
                HistoryItem(
                    modifier = Modifier.padding(10.dp),
                    item = item)
            }
        }
    }
}

@Preview
@Composable
fun HistoryScreenPreview() {
    Laundry_demoTheme {
        HistoryScreen()
    }
}

@Composable
fun EmptyHistoryScreen(
    modifier: Modifier=Modifier,
) {
    Column (
        modifier= modifier,
        verticalArrangement =Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Icon(imageVector =
        ImageVector.vectorResource(id = R.drawable.ic_empty_laundry),
            contentDescription =null )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = stringResource(id = R.string.lbl_no_laundry_history_yet))
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = stringResource(id = R.string.lbl_let_s_do_laundry_transactions_now_and_feel_the_convenience))

    }
}

@Preview
@Composable
fun EmptyHistoryScreenPreview() {
    Laundry_demoTheme {
        EmptyHistoryScreen(
            modifier=Modifier.background(
                color = MaterialTheme.colorScheme.onSurface
            )
        )
    }
}