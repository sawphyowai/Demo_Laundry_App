package com.example.laundry_demo.di;

import com.example.laundry_demo.repository.splash.CheckoutImpl;
import com.example.laundry_demo.repository.splash.CheckoutNavigator;
import com.example.laundry_demo.repository.splash.HomeNavigator;
import com.example.laundry_demo.repository.splash.HomeNavigatorImpl;
import com.example.laundry_demo.repository.splash.LoginNavigator;
import com.example.laundry_demo.repository.splash.LoginNavigatorImpl;
import com.example.laundry_demo.repository.splash.OrderDetailImpl;
import com.example.laundry_demo.repository.splash.OrderDetailNavigator;
import com.example.laundry_demo.repository.splash.PaymentSuccessNavigator;
import com.example.laundry_demo.repository.splash.PaymentSuccessNavigatorImpl;
import com.example.laundry_demo.repository.splash.PaymentNavigator;
import com.example.laundry_demo.repository.splash.PaymentNavigatorImpl;
import com.example.laundry_demo.repository.splash.RegisterNavigator;
import com.example.laundry_demo.repository.splash.RegisterNavigatorImpl;
import com.example.laundry_demo.repository.splash.SplashNavigator;
import com.example.laundry_demo.repository.splash.SplashNavigatorImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.scopes.ViewModelScoped;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H\'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001aH\'\u00a8\u0006\u001b"}, d2 = {"Lcom/example/laundry_demo/di/NavigationModule;", "", "bindCheckout", "Lcom/example/laundry_demo/repository/splash/CheckoutNavigator;", "impl", "Lcom/example/laundry_demo/repository/splash/CheckoutImpl;", "bindHome", "Lcom/example/laundry_demo/repository/splash/HomeNavigator;", "Lcom/example/laundry_demo/repository/splash/HomeNavigatorImpl;", "bindLogin", "Lcom/example/laundry_demo/repository/splash/LoginNavigator;", "Lcom/example/laundry_demo/repository/splash/LoginNavigatorImpl;", "bindOrderDetail", "Lcom/example/laundry_demo/repository/splash/OrderDetailNavigator;", "Lcom/example/laundry_demo/repository/splash/OrderDetailImpl;", "bindPayment", "Lcom/example/laundry_demo/repository/splash/PaymentNavigator;", "Lcom/example/laundry_demo/repository/splash/PaymentNavigatorImpl;", "bindPaymentSuccess", "Lcom/example/laundry_demo/repository/splash/PaymentSuccessNavigator;", "Lcom/example/laundry_demo/repository/splash/PaymentSuccessNavigatorImpl;", "bindRegister", "Lcom/example/laundry_demo/repository/splash/RegisterNavigator;", "Lcom/example/laundry_demo/repository/splash/RegisterNavigatorImpl;", "bindSplash", "Lcom/example/laundry_demo/repository/splash/SplashNavigator;", "Lcom/example/laundry_demo/repository/splash/SplashNavigatorImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public abstract interface NavigationModule {
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.example.laundry_demo.repository.splash.SplashNavigator bindSplash(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.SplashNavigatorImpl impl);
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.example.laundry_demo.repository.splash.LoginNavigator bindLogin(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.LoginNavigatorImpl impl);
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.example.laundry_demo.repository.splash.RegisterNavigator bindRegister(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.RegisterNavigatorImpl impl);
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.example.laundry_demo.repository.splash.HomeNavigator bindHome(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.HomeNavigatorImpl impl);
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.example.laundry_demo.repository.splash.CheckoutNavigator bindCheckout(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.CheckoutImpl impl);
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.example.laundry_demo.repository.splash.PaymentNavigator bindPayment(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.PaymentNavigatorImpl impl);
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.example.laundry_demo.repository.splash.PaymentSuccessNavigator bindPaymentSuccess(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.PaymentSuccessNavigatorImpl impl);
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.example.laundry_demo.repository.splash.OrderDetailNavigator bindOrderDetail(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.OrderDetailImpl impl);
}