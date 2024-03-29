package com.example.laundry_demo.repository.splash

import androidx.navigation.NavController
import com.example.laundry_demo.extension.destination
import com.example.laundry_demo.route.AuthRoute
import com.example.laundry_demo.route.MainRoute
import com.example.laundry_demo.route.RootRoute
import javax.inject.Inject

class LoginNavigatorImpl @Inject constructor() : LoginNavigator {
    override var navController: NavController?=null

    override fun navigateToRegister() {
        navController?.popBackStack()
        navController?.navigate(AuthRoute.Register){
            launchSingleTop=true
        }
    }

    override fun navigateToHome() {
        navController?.popBackStack()
        navController?.navigate(RootRoute.main){
            launchSingleTop=true

        }
    }
}