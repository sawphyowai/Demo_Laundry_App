package com.example.laundry_demo.presenter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.laundry_demo.detailscreen.CheckOutDataVO
import com.example.laundry_demo.detailscreen.CheckOutState
import com.example.laundry_demo.repository.splash.CheckoutNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CheckOutViewModel @Inject constructor(
    private val checkoutNavigator: CheckoutNavigator
):ViewModel() {

    private val _checkOutState= mutableStateOf(CheckOutState())
    private val _cacheState=_checkOutState
    val checkOutState:State<CheckOutState> = _checkOutState

    fun onAddListener(item:CheckOutDataVO){
        operator(item,1)
    }

    fun setUpNavigator(navController:NavController){
        checkoutNavigator.navController=navController
    }

    fun onRemoveListener(item:CheckOutDataVO){
        operator(item,-1)
    }

    fun navigateToPayment(){
        checkoutNavigator.navigateToPayment()
    }

    fun navigateToBack(){
        checkoutNavigator.navigateToBack()
    }

    private fun operator(item:CheckOutDataVO,operator:Int){
        val foundValue=_cacheState.value.orderList.find { it.id==item.id }
        if(foundValue !=null){
            val updateValue=foundValue.copy(value = foundValue.value + operator)
            val updateList=_cacheState.value.orderList.map {
                if(it==foundValue) updateValue else it
            }
            _checkOutState.value=_cacheState.value.copy(orderList=updateList)

        }
    }
}