package com.example.laundry_demo.extension

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

fun NavController.destination(route:String){
    this.navigate(route){
        launchSingleTop=true
        popUpTo(
            this@destination.graph.findStartDestination().id
        ){
            saveState=true
        }
        restoreState=true
    }
}