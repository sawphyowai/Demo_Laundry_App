package com.example.laundry_demo.repository.splash

import androidx.navigation.NavController
import com.example.laundry_demo.extension.destination
import com.example.laundry_demo.route.RootRoute
import javax.inject.Inject

class SplashNavigatorImpl @Inject constructor() :SplashNavigator {

    override var navController: NavController?=null

    override fun navigateToLogin() {
        navController?.popBackStack()
        navController?.navigate(RootRoute.login){
            launchSingleTop=true
        }
    }
}