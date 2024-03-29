package com.example.laundry_demo.presenter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.laundry_demo.history.HistoryDataVO
import com.example.laundry_demo.history.HistoryState

class HistoryViewModel :ViewModel() {
    private val _historyState= mutableStateOf(HistoryState())
    val historyState:State<HistoryState> =_historyState
}