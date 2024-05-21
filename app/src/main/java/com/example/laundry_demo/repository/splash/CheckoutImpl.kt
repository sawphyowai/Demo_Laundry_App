package com.example.laundry_demo.repository.splash

import androidx.navigation.NavController
import com.example.laundry_demo.extension.destination
import com.example.laundry_demo.route.RootRoute
import javax.inject.Inject

class CheckoutImpl @Inject constructor() :CheckoutNavigator {
    override var navController: NavController?=null

    override fun navigateToPayment() {
        navController?.navigate(RootRoute.payment)
    }

    override fun navigateToBack() {
        navController?.popBackStack()
    }

}