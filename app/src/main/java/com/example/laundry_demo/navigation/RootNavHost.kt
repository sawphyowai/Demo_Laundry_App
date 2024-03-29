package com.example.laundry_demo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.laundry_demo.detailscreen.CheckOutScreen
import com.example.laundry_demo.mainscreen.MainScreen
import com.example.laundry_demo.orderdetail.OrderDetailScreen
import com.example.laundry_demo.payment.PaymentScreen
import com.example.laundry_demo.paymentsuccess.PaymentSuccessScreen
import com.example.laundry_demo.presenter.CheckOutViewModel
import com.example.laundry_demo.presenter.OrderDetailViewModel
import com.example.laundry_demo.presenter.PaymentSuccessViewModel
import com.example.laundry_demo.presenter.PaymentViewModel
import com.example.laundry_demo.presenter.SplashViewModel
import com.example.laundry_demo.route.RootRoute
import com.example.laundry_demo.ui.splashscreen.SplashScreen


@Composable
fun RootNavGraph() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = RootRoute.splash){

        authNavHost(rootNavigation = navController)

        composable(route=RootRoute.splash){
            val viewModel= hiltViewModel<SplashViewModel>()
            viewModel.setNavController(navController)
            SplashScreen(modifier = Modifier,viewModel=viewModel)
        }

        composable(route=RootRoute.main){
            MainScreen(mainNavController=navController)
        }

        composable(route=RootRoute.checkout){
            val viewModel= hiltViewModel<CheckOutViewModel>()
            viewModel.setUpNavigator(navController)
            CheckOutScreen(
                viewModel=viewModel
            )
        }
        composable(route=RootRoute.payment){
            val viewModel=hiltViewModel<PaymentViewModel>()
            viewModel.setUpNavController(navController)
            PaymentScreen(
                paymentViewModel =viewModel
            )
        }
        composable(route=RootRoute.paymentSuccess){
            val viewModel=hiltViewModel<PaymentSuccessViewModel>()
            viewModel.setUpNavController(navController)
            PaymentSuccessScreen(
                viewModel=viewModel
            )
        }
        composable(route=RootRoute.orderDetail){
            val viewModel=hiltViewModel<OrderDetailViewModel>()
            viewModel.setUpNavController(navController)
            OrderDetailScreen(
                viewModel = viewModel
            )
        }
    }
}