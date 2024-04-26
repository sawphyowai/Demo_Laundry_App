package com.example.laundry_demo.presenter;

import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import com.example.laundry_demo.repository.splash.LoginNavigator;
import com.example.laundry_demo.state.LoginSate;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/laundry_demo/presenter/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginNavigator", "Lcom/example/laundry_demo/repository/splash/LoginNavigator;", "(Lcom/example/laundry_demo/repository/splash/LoginNavigator;)V", "_cacheState", "Landroidx/compose/runtime/MutableState;", "Lcom/example/laundry_demo/state/LoginSate;", "_loginState", "loginSate", "Landroidx/compose/runtime/State;", "getLoginSate", "()Landroidx/compose/runtime/State;", "navigateToHome", "", "navigateToRegister", "onChangeEmail", "email", "", "onChangePassword", "password", "setUpNavController", "navController", "Landroidx/navigation/NavController;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.laundry_demo.repository.splash.LoginNavigator loginNavigator = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.example.laundry_demo.state.LoginSate> _loginState;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.laundry_demo.state.LoginSate> _cacheState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.laundry_demo.state.LoginSate> loginSate = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.repository.splash.LoginNavigator loginNavigator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.laundry_demo.state.LoginSate> getLoginSate() {
        return null;
    }
    
    public final void onChangeEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
    }
    
    public final void setUpNavController(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    public final void onChangePassword(@org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void navigateToRegister() {
    }
    
    public final void navigateToHome() {
    }
}