package com.example.laundry_demo.presenter

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.laundry_demo.home.HomeState
import com.example.laundry_demo.home.LaundryDaVo
import com.example.laundry_demo.repository.splash.HomeNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeNavigator: HomeNavigator
):ViewModel() {

    private val _homeState= mutableStateOf(HomeState())
    private val _cacheState=_homeState
    val homeState: State<HomeState> =_homeState

    fun search(searchValue:String){
        _homeState.value=_cacheState.value.copy(search =searchValue)
    }

    fun setNavController(navController:NavController){
        homeNavigator.navController=navController
    }

    fun navigateToCheckOut(){
        Log.d("OKOK_Vlaue", "2")
        homeNavigator.navigateToCheckOut()
    }
}