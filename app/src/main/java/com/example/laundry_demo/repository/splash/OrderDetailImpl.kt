package com.example.laundry_demo.repository.splash

import androidx.navigation.NavController
import javax.inject.Inject

class OrderDetailImpl @Inject constructor() :OrderDetailNavigator {
    override var navController: NavController? =null

    override fun navigateToBack() {
        navController?.popBackStack()
    }
}