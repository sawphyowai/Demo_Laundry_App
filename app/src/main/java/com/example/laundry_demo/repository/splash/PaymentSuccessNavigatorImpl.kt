package com.example.laundry_demo.repository.splash

import androidx.navigation.NavController
import com.example.laundry_demo.extension.destination
import com.example.laundry_demo.route.RootRoute
import javax.inject.Inject

class PaymentSuccessNavigatorImpl @Inject constructor():PaymentSuccessNavigator{
    override var navController: NavController?=null

    override fun navigateToOrderDetail() {
        navController?.navigate(RootRoute.orderDetail){
            popUpTo(RootRoute.main)
        }
    }

    override fun navigateToHome() {
        navController?.popBackStack(RootRoute.main, inclusive = false, saveState = false)

    }
}