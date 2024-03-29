package com.example.laundry_demo.presenter

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.laundry_demo.repository.splash.PaymentSuccessNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PaymentSuccessViewModel @Inject constructor(
    private val paymentSuccessNavigator: PaymentSuccessNavigator
) :ViewModel() {

    fun setUpNavController(navController:NavController){
        paymentSuccessNavigator.navController=navController
    }

    fun navigateToDetail(){
        paymentSuccessNavigator.navigateToOrderDetail()
    }

    fun navigateToBack(){
        paymentSuccessNavigator.navigateToHome()
    }


}