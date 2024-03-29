package com.example.laundry_demo.presenter

import android.util.Log.d
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.laundry_demo.payment.PaymentDataVO
import com.example.laundry_demo.payment.PaymentState
import com.example.laundry_demo.repository.splash.PaymentNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PaymentViewModel @Inject constructor(
    private val paymentNavigator: PaymentNavigator
):ViewModel() {
    private val _paymentState= mutableStateOf(PaymentState())
    private val _cachedState={_paymentState.value}
    val paymentState:State<PaymentState> = _paymentState

    fun onCheckSelfPayment(){
        val state=_cachedState()
        _paymentState.value=state.copy(
            isCheckDeliveryService = false,
            isCheckService = !state.isCheckService
            )
    }

    fun onCheckDeliveryService(){
        val state=_cachedState()
        _paymentState.value=state.copy(
            isCheckService = false,
            isCheckDeliveryService =  !state.isCheckDeliveryService
        )
    }

    fun setUpNavController(navController:NavController){
        paymentNavigator.navController=navController
    }

    fun navigateToPaymentSuccess(){
        paymentNavigator.navigateToPaymentSuccess()
    }

    fun navigateToBack(){
        paymentNavigator.navigateToBack()
    }

    fun onCheckPaymentMethod(item:PaymentDataVO){
        var payment=_cachedState.invoke().paymentList.toMutableList()
        val updateCheckList=payment.map {
            it.copy(isCheck = it.id==item.id)
        }
        payment.clear()
        payment=updateCheckList.toMutableList()
        _paymentState.value=_cachedState.invoke().copy(paymentList = payment.toList())

    }

}