package com.example.laundry_demo.presenter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.laundry_demo.repository.splash.LoginNavigator
import com.example.laundry_demo.state.LoginSate
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginNavigator: LoginNavigator
):ViewModel(){
    private var _loginState= mutableStateOf(LoginSate.default())
    private val _cacheState=_loginState
    val loginSate:State<LoginSate> = _loginState

    fun onChangeEmail(email:String){
        _loginState.value=_cacheState.value.copy(email=email)
    }

    fun setUpNavController(navController: NavController){
        loginNavigator.navController=navController
    }

    fun onChangePassword(password:String){
        _loginState.value=_cacheState.value.copy(password=password)
    }

    fun navigateToRegister(){
        loginNavigator.navigateToRegister()
    }

    fun navigateToHome(){
        loginNavigator.navigateToHome()
    }

}