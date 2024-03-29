package com.example.laundry_demo.route

import androidx.annotation.DrawableRes
import com.example.laundry_demo.R

sealed class MainRoute (val route:String,
                        val label:String,
                        @DrawableRes val icon:Int){
    companion object{
        const val Home="/Home"
        const val Chat="/Chat"
        const val History="/History"
        const val Profile="/Profile"
    }
    data class Home(private val name:String):
        MainRoute(route = Home,label=name, icon = R.drawable.ic_round_home)

    data class Chat(private val name:String):
        MainRoute(route = Chat,label=name, icon = R.drawable.ic_round_chat)

    data class History(private val name:String):
        MainRoute(route = History,label=name, icon = R.drawable.ic_round_notes)

    data class Profile(private val name:String):
        MainRoute(route = Profile,label=name, icon = R.drawable.ic_outline_person)
}