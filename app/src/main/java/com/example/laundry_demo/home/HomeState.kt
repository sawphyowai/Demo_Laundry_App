package com.example.laundry_demo.home

data class HomeState(
    val search:String="",
    val itemList:List<LaundryDaVo> =
        listOf(
            LaundryDaVo.itemDefault(),
            LaundryDaVo.itemDefault(),
            LaundryDaVo.itemDefault(),
            LaundryDaVo.itemDefault(),
            LaundryDaVo.itemDefault()
        )

)
