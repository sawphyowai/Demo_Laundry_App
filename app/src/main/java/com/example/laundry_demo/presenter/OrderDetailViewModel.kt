package com.example.laundry_demo.presenter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.laundry_demo.orderdetail.OrderDetailState
import com.example.laundry_demo.repository.splash.OrderDetailNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OrderDetailViewModel @Inject constructor(
    private val orderDetailNavigator: OrderDetailNavigator
) :ViewModel() {

    private val _orderDetail= mutableStateOf(OrderDetailState.idle())
    val orderDetail:State<OrderDetailState> = _orderDetail

    fun setUpNavController(navigator: NavController){
        orderDetailNavigator.navController=navigator
    }

    fun navigateToHome(){
        orderDetailNavigator.navigateToBack()
    }
}