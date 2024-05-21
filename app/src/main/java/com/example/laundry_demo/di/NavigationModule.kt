package com.example.laundry_demo.di

import com.example.laundry_demo.repository.splash.CheckoutImpl
import com.example.laundry_demo.repository.splash.CheckoutNavigator
import com.example.laundry_demo.repository.splash.HomeNavigator
import com.example.laundry_demo.repository.splash.HomeNavigatorImpl
import com.example.laundry_demo.repository.splash.LoginNavigator
import com.example.laundry_demo.repository.splash.LoginNavigatorImpl
import com.example.laundry_demo.repository.splash.OrderDetailImpl
import com.example.laundry_demo.repository.splash.OrderDetailNavigator
import com.example.laundry_demo.repository.splash.PaymentSuccessNavigator
import com.example.laundry_demo.repository.splash.PaymentSuccessNavigatorImpl
import com.example.laundry_demo.repository.splash.PaymentNavigator
import com.example.laundry_demo.repository.splash.PaymentNavigatorImpl
import com.example.laundry_demo.repository.splash.RegisterNavigator
import com.example.laundry_demo.repository.splash.RegisterNavigatorImpl
import com.example.laundry_demo.repository.splash.SplashNavigator
import com.example.laundry_demo.repository.splash.SplashNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
interface NavigationModule {
    @Binds
    @ViewModelScoped
    fun bindSplash(impl:SplashNavigatorImpl):SplashNavigator

    @Binds
    @ViewModelScoped
    fun bindLogin(impl:LoginNavigatorImpl):LoginNavigator

    @Binds
    @ViewModelScoped
    fun bindRegister(impl:RegisterNavigatorImpl):RegisterNavigator

    @Binds
    @ViewModelScoped
    fun bindHome(impl:HomeNavigatorImpl):HomeNavigator

    @Binds
    @ViewModelScoped
    fun bindCheckout(impl:CheckoutImpl):CheckoutNavigator

    @Binds
    @ViewModelScoped
    fun bindPayment(impl:PaymentNavigatorImpl):PaymentNavigator

    @Binds
    @ViewModelScoped
    fun bindPaymentSuccess(impl:PaymentSuccessNavigatorImpl):PaymentSuccessNavigator

    @Binds
    @ViewModelScoped
    fun bindOrderDetail(impl:OrderDetailImpl):OrderDetailNavigator

}