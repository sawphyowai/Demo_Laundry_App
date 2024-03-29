package com.example.laundry_demo.repository.splash

import androidx.navigation.NavController
import com.example.laundry_demo.extension.destination
import com.example.laundry_demo.route.RootRoute
import javax.inject.Inject

class HomeNavigatorImpl @Inject constructor() : HomeNavigator {

    override var navController: NavController?=null

    override fun navigateToCheckOut() {
        navController?.navigate(RootRoute.checkout)
    }
}