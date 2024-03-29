package com.example.laundry_demo.orderdetail

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class OrderDetailDataVO(
    val id:String,
    val name:String,
    val deadline:Long,
    val address:String,
    val estimate:String
){
    companion object{
        fun idle():OrderDetailDataVO{
            return OrderDetailDataVO(
                id = "1711453386496",
                name = "T-Shirt",
                deadline=System.currentTimeMillis(),
                address = "Hlaing Thar Yar",
                estimate = "1 day"
            )
        }

    }
    fun changeDateFormat(): String{
        val date = Date(deadline)
        val sdf = SimpleDateFormat("hh:mm a", Locale.getDefault())
        return sdf.format(date)
    }
}
