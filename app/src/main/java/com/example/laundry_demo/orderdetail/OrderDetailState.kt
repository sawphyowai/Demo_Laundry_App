package com.example.laundry_demo.orderdetail

import com.example.laundry_demo.enums.LaundryStatus
import com.example.laundry_demo.enums.WashingStatus

data class OrderDetailState(
    val list:List<WashingStatus> = emptyList(),
    val order:OrderDetailDataVO
){
    companion object{
        fun idle():OrderDetailState{
            return OrderDetailState(
                list = listOf(
                    WashingStatus.Washing(
                        status = LaundryStatus.Finish,
                        name = "Washing"
                    ),
                    WashingStatus.Cleaning(
                        status = LaundryStatus.Finish,
                        name = "Cleaning"
                    ),
                    WashingStatus.Drying(
                        status = LaundryStatus.Continue,
                        name = "Drying"
                    ),
                    WashingStatus.Delivery(
                        status = LaundryStatus.NotStart,
                        name = "Delivery"
                    )
                ),
                order = OrderDetailDataVO.idle()
            )
        }
    }
}
