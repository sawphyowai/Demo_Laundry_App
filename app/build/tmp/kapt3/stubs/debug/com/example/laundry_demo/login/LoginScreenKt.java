package com.example.laundry_demo.login;

import androidx.compose.material3.ButtonDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.tooling.preview.Preview;
import com.example.laundry_demo.R;
import com.example.laundry_demo.presenter.LoginViewModel;
import com.example.laundry_demo.repository.splash.LoginNavigator;
import com.example.laundry_demo.repository.splash.LoginNavigatorImpl;
import com.example.laundry_demo.state.LoginSate;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0007\u001a\\\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007\u00a8\u0006\u0011"}, d2 = {"LoginScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/example/laundry_demo/presenter/LoginViewModel;", "LoginScreenPreview", "LoginScreenStateLess", "loginState", "Lcom/example/laundry_demo/state/LoginSate;", "onChangeEmail", "Lkotlin/Function1;", "", "onChangePassword", "navigateToRegister", "Lkotlin/Function0;", "navigateToHome", "app_debug"})
public final class LoginScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void LoginScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.example.laundry_demo.presenter.LoginViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void LoginScreenStateLess(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.example.laundry_demo.state.LoginSate loginState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onChangeEmail, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onChangePassword, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToRegister, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToHome) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    public static final void LoginScreenPreview() {
    }
}