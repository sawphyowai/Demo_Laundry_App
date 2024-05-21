package com.example.laundry_demo.repository.splash

import com.example.laundry_demo.base.BaseNavigator


interface PaymentSuccessNavigator :BaseNavigator{
    fun navigateToOrderDetail()
    fun navigateToHome()
}