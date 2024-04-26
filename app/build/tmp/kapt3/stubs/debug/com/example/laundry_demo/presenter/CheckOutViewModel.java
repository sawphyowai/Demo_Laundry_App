package com.example.laundry_demo.presenter;

import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import com.example.laundry_demo.detailscreen.CheckOutDataVO;
import com.example.laundry_demo.detailscreen.CheckOutState;
import com.example.laundry_demo.repository.splash.CheckoutNavigator;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/laundry_demo/presenter/CheckOutViewModel;", "Landroidx/lifecycle/ViewModel;", "checkoutNavigator", "Lcom/example/laundry_demo/repository/splash/CheckoutNavigator;", "(Lcom/example/laundry_demo/repository/splash/CheckoutNavigator;)V", "_cacheState", "Landroidx/compose/runtime/MutableState;", "Lcom/example/laundry_demo/detailscreen/CheckOutState;", "_checkOutState", "checkOutState", "Landroidx/compose/runtime/State;", "getCheckOutState", "()Landroidx/compose/runtime/State;", "navigateToBack", "", "navigateToPayment", "onAddListener", "item", "Lcom/example/laundry_demo/detailscreen/CheckOutDataVO;", "onRemoveListener", "operator", "", "setUpNavigator", "navController", "Landroidx/navigation/NavController;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CheckOutViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.laundry_demo.repository.splash.CheckoutNavigator checkoutNavigator = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.laundry_demo.detailscreen.CheckOutState> _checkOutState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.laundry_demo.detailscreen.CheckOutState> _cacheState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.laundry_demo.detailscreen.CheckOutState> checkOutState = null;
    
    @javax.inject.Inject
    public CheckOutViewModel(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.CheckoutNavigator checkoutNavigator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.laundry_demo.detailscreen.CheckOutState> getCheckOutState() {
        return null;
    }
    
    public final void onAddListener(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.detailscreen.CheckOutDataVO item) {
    }
    
    public final void setUpNavigator(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    public final void onRemoveListener(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.detailscreen.CheckOutDataVO item) {
    }
    
    public final void navigateToPayment() {
    }
    
    public final void navigateToBack() {
    }
    
    private final void operator(com.example.laundry_demo.detailscreen.CheckOutDataVO item, int operator) {
    }
}