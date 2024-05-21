package com.example.laundry_demo.repository.splash

import androidx.navigation.NavController
import com.example.laundry_demo.extension.destination
import com.example.laundry_demo.route.RootRoute
import javax.inject.Inject

class PaymentNavigatorImpl @Inject constructor():PaymentNavigator{

    override var navController: NavController?=null

    override fun navigateToPaymentSuccess() {
        navController?.navigate(RootRoute.paymentSuccess)
    }

    override fun navigateToBack() {
        navController?.popBackStack()
    }

}