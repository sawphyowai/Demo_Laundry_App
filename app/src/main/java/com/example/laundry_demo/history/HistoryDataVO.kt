package com.example.laundry_demo.history

import com.example.laundry_demo.enums.LaundryStatus
import com.example.laundry_demo.enums.WashingStatus
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class HistoryDataVO(
    val name:String,
    val deadLine:Long,
    val washingStatus:WashingStatus
){

    companion object{
        fun idle():HistoryDataVO{
            return HistoryDataVO(
                name = "Happy Laundry",
                deadLine = System.currentTimeMillis(),
                washingStatus = WashingStatus.Delivery(
                    LaundryStatus.Finish,
                    name = LaundryStatus.Finish.name
                )
            )
        }
    }
    fun changeDateFormat(): String{
        val date = Date(deadLine)
        val sdf = SimpleDateFormat("hh:mm a", Locale.getDefault())
        return sdf.format(date)
    }
}
