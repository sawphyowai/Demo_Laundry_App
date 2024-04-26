package com.example.laundry_demo.presenter;

import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import com.example.laundry_demo.orderdetail.OrderDetailState;
import com.example.laundry_demo.repository.splash.OrderDetailNavigator;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/laundry_demo/presenter/OrderDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "orderDetailNavigator", "Lcom/example/laundry_demo/repository/splash/OrderDetailNavigator;", "(Lcom/example/laundry_demo/repository/splash/OrderDetailNavigator;)V", "_orderDetail", "Landroidx/compose/runtime/MutableState;", "Lcom/example/laundry_demo/orderdetail/OrderDetailState;", "orderDetail", "Landroidx/compose/runtime/State;", "getOrderDetail", "()Landroidx/compose/runtime/State;", "navigateToHome", "", "setUpNavController", "navigator", "Landroidx/navigation/NavController;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class OrderDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.laundry_demo.repository.splash.OrderDetailNavigator orderDetailNavigator = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.laundry_demo.orderdetail.OrderDetailState> _orderDetail = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.laundry_demo.orderdetail.OrderDetailState> orderDetail = null;
    
    @javax.inject.Inject
    public OrderDetailViewModel(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.OrderDetailNavigator orderDetailNavigator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.laundry_demo.orderdetail.OrderDetailState> getOrderDetail() {
        return null;
    }
    
    public final void setUpNavController(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navigator) {
    }
    
    public final void navigateToHome() {
    }
}