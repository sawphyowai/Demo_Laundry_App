package com.example.laundry_demo.mainscreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.laundry_demo.extension.destination
import com.example.laundry_demo.navigation.MainBottomNavigation
import com.example.laundry_demo.navigation.MainNavHost
import com.example.laundry_demo.route.MainRoute
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@Composable
fun MainScreen(mainNavController: NavHostController) {

    val bottomItem= listOf(
        MainRoute.Home("Home"),
        MainRoute.Chat("Chat"),
        MainRoute.History("History"),
        MainRoute.Profile("Profile")
    )

    val navController = rememberNavController()

    Scaffold (
        bottomBar = {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination
            MainBottomNavigation(
                routes = bottomItem,
                currentRoute ={currentDestination?.route},
                onTopItem ={item->
                    navController.destination(item.route)
                } )
        }
    ){ value->
         MainNavHost(
             modifier = Modifier.padding(value),
             navController=navController,
             mainNavController=mainNavController
             )
    }
}

//@Preview
//@Composable
//fun MainScreenPreview() {
//    Laundry_demoTheme {
//        MainScreen(navController)
//    }
//}