package com.example.laundry_demo.presenter;

import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import com.example.laundry_demo.repository.splash.PaymentSuccessNavigator;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/laundry_demo/presenter/PaymentSuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentSuccessNavigator", "Lcom/example/laundry_demo/repository/splash/PaymentSuccessNavigator;", "(Lcom/example/laundry_demo/repository/splash/PaymentSuccessNavigator;)V", "navigateToBack", "", "navigateToDetail", "setUpNavController", "navController", "Landroidx/navigation/NavController;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class PaymentSuccessViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.laundry_demo.repository.splash.PaymentSuccessNavigator paymentSuccessNavigator = null;
    
    @javax.inject.Inject
    public PaymentSuccessViewModel(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.PaymentSuccessNavigator paymentSuccessNavigator) {
        super();
    }
    
    public final void setUpNavController(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    public final void navigateToDetail() {
    }
    
    public final void navigateToBack() {
    }
}