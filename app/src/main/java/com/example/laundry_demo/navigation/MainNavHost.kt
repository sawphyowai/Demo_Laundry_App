package com.example.laundry_demo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.laundry_demo.chat.ChatScreen
import com.example.laundry_demo.history.HistoryScreen
import com.example.laundry_demo.home.HomeScreen
import com.example.laundry_demo.presenter.HomeViewModel
import com.example.laundry_demo.profile.ProfileScreen
import com.example.laundry_demo.route.MainRoute


@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    mainNavController: NavHostController
) {
    NavHost(navController =navController , startDestination =MainRoute.Home ){
        composable(route=MainRoute.Home){
            val viewModel= hiltViewModel<HomeViewModel>()
            viewModel.setNavController(mainNavController)
            HomeScreen(
                viewModel=viewModel
            )
        }
        composable(route=MainRoute.Chat){
            ChatScreen()
        }
        composable(route=MainRoute.History){
            HistoryScreen()
        }
        composable(route=MainRoute.Profile){
            ProfileScreen()
        }
    }
}