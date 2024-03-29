package com.example.laundry_demo.repository.splash

import com.example.laundry_demo.base.BaseNavigator

interface LoginNavigator : BaseNavigator{
    fun navigateToRegister()
    fun navigateToHome()
}