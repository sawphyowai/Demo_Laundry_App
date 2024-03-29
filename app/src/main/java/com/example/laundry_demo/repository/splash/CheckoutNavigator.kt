package com.example.laundry_demo.repository.splash

import com.example.laundry_demo.base.BaseNavigator

interface CheckoutNavigator :BaseNavigator {
    fun navigateToPayment()
    fun navigateToBack()
}