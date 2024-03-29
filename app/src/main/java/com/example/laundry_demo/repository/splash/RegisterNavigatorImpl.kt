package com.example.laundry_demo.repository.splash

import androidx.navigation.NavController
import com.example.laundry_demo.extension.destination
import com.example.laundry_demo.route.AuthRoute
import com.example.laundry_demo.route.RootRoute
import javax.inject.Inject

class RegisterNavigatorImpl @Inject constructor() :RegisterNavigator{

    override var navController: NavController?=null

    override fun navigateToLogin() {
        navController?.popBackStack()
       navController?.navigate(AuthRoute.Login){
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