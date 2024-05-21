package com.example.laundry_demo.home

data class LaundryDaVo(
    var name:String,
    val place:String,
    val price:String
){
    companion object{
        fun itemDefault():LaundryDaVo{
            return  LaundryDaVo(
                name = "MSIS",
                place = "Yangon",
                price = "50"
            )
        }
    }
}
