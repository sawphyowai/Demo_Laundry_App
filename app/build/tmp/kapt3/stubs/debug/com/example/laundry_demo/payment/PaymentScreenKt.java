package com.example.laundry_demo.payment;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import com.example.laundry_demo.presenter.PaymentViewModel;
import com.example.laundry_demo.R;
import com.example.laundry_demo.repository.splash.PaymentNavigatorImpl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0007\u001a\\\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u00a8\u0006\u0012"}, d2 = {"PaymentScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "paymentViewModel", "Lcom/example/laundry_demo/presenter/PaymentViewModel;", "PaymentScreenPreview", "PaymentScreenStateLess", "paymentState", "Lcom/example/laundry_demo/payment/PaymentState;", "onCheckSelfPayment", "Lkotlin/Function0;", "onCheckDeliveryService", "onCheckPaymentMethod", "Lkotlin/Function1;", "Lcom/example/laundry_demo/payment/PaymentDataVO;", "navigateToPaymentSuccess", "navigateToBack", "app_debug"})
public final class PaymentScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void PaymentScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.example.laundry_demo.presenter.PaymentViewModel paymentViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void PaymentScreenStateLess(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.payment.PaymentState paymentState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCheckSelfPayment, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCheckDeliveryService, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.laundry_demo.payment.PaymentDataVO, kotlin.Unit> onCheckPaymentMethod, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToPaymentSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToBack) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    public static final void PaymentScreenPreview() {
    }
}