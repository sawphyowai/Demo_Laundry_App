package com.example.laundry_demo.presenter;

import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import com.example.laundry_demo.payment.PaymentDataVO;
import com.example.laundry_demo.payment.PaymentState;
import com.example.laundry_demo.repository.splash.PaymentNavigator;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/example/laundry_demo/presenter/PaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentNavigator", "Lcom/example/laundry_demo/repository/splash/PaymentNavigator;", "(Lcom/example/laundry_demo/repository/splash/PaymentNavigator;)V", "_cachedState", "Lkotlin/Function0;", "Lcom/example/laundry_demo/payment/PaymentState;", "_paymentState", "Landroidx/compose/runtime/MutableState;", "paymentState", "Landroidx/compose/runtime/State;", "getPaymentState", "()Landroidx/compose/runtime/State;", "navigateToBack", "", "navigateToPaymentSuccess", "onCheckDeliveryService", "onCheckPaymentMethod", "item", "Lcom/example/laundry_demo/payment/PaymentDataVO;", "onCheckSelfPayment", "setUpNavController", "navController", "Landroidx/navigation/NavController;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class PaymentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.laundry_demo.repository.splash.PaymentNavigator paymentNavigator = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.laundry_demo.payment.PaymentState> _paymentState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<com.example.laundry_demo.payment.PaymentState> _cachedState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.laundry_demo.payment.PaymentState> paymentState = null;
    
    @javax.inject.Inject
    public PaymentViewModel(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.PaymentNavigator paymentNavigator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.laundry_demo.payment.PaymentState> getPaymentState() {
        return null;
    }
    
    public final void onCheckSelfPayment() {
    }
    
    public final void onCheckDeliveryService() {
    }
    
    public final void setUpNavController(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    public final void navigateToPaymentSuccess() {
    }
    
    public final void navigateToBack() {
    }
    
    public final void onCheckPaymentMethod(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.payment.PaymentDataVO item) {
    }
}