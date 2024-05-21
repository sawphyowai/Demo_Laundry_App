package com.example.laundry_demo.orderdetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.compoment.OrderDerailBody
import com.example.laundry_demo.compoment.OrderDetailCard
import com.example.laundry_demo.compoment.OrderDetailProgress
import com.example.laundry_demo.compoment.OrderDetailTopAdapter
import com.example.laundry_demo.enums.LaundryStatus
import com.example.laundry_demo.presenter.OrderDetailViewModel
import com.example.laundry_demo.repository.splash.OrderDetailImpl
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import kotlin.reflect.KFunction0


@Composable
fun OrderDetailScreen(
    modifier: Modifier=Modifier,
    viewModel:OrderDetailViewModel
    ) {
    val orderDetailState by remember{
        viewModel.orderDetail
    }
    OrderDetailScreenStateless(
        modifier = modifier,
        orderDetailState=orderDetailState,
        navigateToBack=viewModel::navigateToHome
        )
}

@Composable
fun OrderDetailScreenStateless(
    modifier: Modifier,
    orderDetailState: OrderDetailState,
    navigateToBack: ()-> Unit
) {

    val isFinish=orderDetailState.list.last().laundryStatus==LaundryStatus.Finish
    val current=orderDetailState.list.first { it.laundryStatus==LaundryStatus.Continue }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            OrderDetailTopAdapter(
                navigatedToBack=navigateToBack
            )
        }
    ) {value->
        if(!isFinish)
        Column(modifier = Modifier.padding(value)) {
            OrderDerailBody(washingStatus=current)
            Spacer(modifier = Modifier.height(40.dp))
            OrderDetailProgress(
                modifier = Modifier,
                status=orderDetailState.list
                )
            OrderDetailCard(
                modifier=Modifier.padding(10.dp),
                item = orderDetailState.order,
                )
        }
    }
}


@Preview
@Composable
fun OrderDetailScreenPreview() {
    Laundry_demoTheme {
        OrderDetailScreen(
            modifier=Modifier.background(color = MaterialTheme.colorScheme.surface),
            viewModel = OrderDetailViewModel(
                orderDetailNavigator = OrderDetailImpl()
            )
            )
    }
}