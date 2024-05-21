package com.example.laundry_demo.presenter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.laundry_demo.chat.ChatDataVo
import com.example.laundry_demo.chat.ChatState

class ChatViewModel :ViewModel() {
    private val _searchState= mutableStateOf(ChatState())
    private val _cachedState=_searchState
    val searchState:State<ChatState> =_searchState

    fun search(search:String){
        _searchState.value=_cachedState.value.copy(search=search)
    }
}