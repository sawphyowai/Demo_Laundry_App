package com.example.laundry_demo.presenter

import android.util.Log.d
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.laundry_demo.repository.splash.SplashNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(private val splashNavigation:SplashNavigator) :ViewModel() {

    fun setNavController(navController: NavController){
        splashNavigation.navController=navController
    }

    fun navigateToLogin(){
        d("OKOK_NavigateToLogin","OKOK")
        splashNavigation.navigateToLogin()
    }
}