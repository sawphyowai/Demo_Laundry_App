package com.example.laundry_demo.presenter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.laundry_demo.profile.ProfileState
import com.example.laundry_demo.profile.UserDataVO

class ProfileViewModel :ViewModel() {
    private val _profileState = mutableStateOf(ProfileState(profile = UserDataVO.idle()))
    val profileState:State<ProfileState> = _profileState

    fun onChangeAccount(){

    }

    fun onChangeLanguage(){

    }

    fun onChangePreference(){

    }

    fun onChangeNotification(){

    }

    fun onChangeHelp(){

    }
}