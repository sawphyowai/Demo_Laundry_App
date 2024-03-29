package com.example.laundry_demo.detailscreen

data class CheckOutState(
    val orderList:List<CheckOutDataVO> = CheckOutDataVO.orderList()
)
