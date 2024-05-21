package com.example.laundry_demo.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.laundry_demo.login.LoginScreen
import com.example.laundry_demo.presenter.LoginViewModel
import com.example.laundry_demo.presenter.RegisterViewModel
import com.example.laundry_demo.register.RegisterScreen
import com.example.laundry_demo.route.AuthRoute

fun NavGraphBuilder.authNavHost(
    rootNavigation:NavController
) {
    navigation(
        route = AuthRoute.Auth,
        startDestination=AuthRoute.Login
    ){
        composable(route=AuthRoute.Login){
            val viewModel= hiltViewModel<LoginViewModel>()
            viewModel.setUpNavController(rootNavigation)
            LoginScreen(viewModel = viewModel)
        }
        composable(route=AuthRoute.Register){
            val viewModel=hiltViewModel<RegisterViewModel>()
            viewModel.setUpNavController(rootNavigation)
            RegisterScreen(viewModel=viewModel)
        }
    }

}