package com.example.laundry_demo.presenter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.laundry_demo.register.RegisterState
import com.example.laundry_demo.repository.splash.RegisterNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor (
    private val registerNavigator: RegisterNavigator
):ViewModel() {
    private val _registerState= mutableStateOf(RegisterState.default())
    private val _cachedRegisterState=_registerState
    val registerState: State<RegisterState> =_registerState

    fun onChangeName(name:String){
        _registerState.value=_cachedRegisterState.value.copy(name = name)
    }

    fun setUpNavController(navController: NavController){
        registerNavigator.navController=navController
    }

    fun onChangeEmail(email:String){
        _registerState.value=_cachedRegisterState.value.copy(email = email)
    }

    fun onChangePassword(password:String){
        _registerState.value=_cachedRegisterState.value.copy(password = password)
    }

    fun navigateToLogin(){
        registerNavigator.navigateToLogin()
    }

    fun navigatedToHome(){
        registerNavigator.navigateToHome()

    }
}