package com.example.laundry_demo.detailscreen

data class CheckOutDataVO(
    val id:Int,
    val name:String,
    val price:String,
    var value:Int
){
    companion object{
        fun idle():CheckOutDataVO{
            return CheckOutDataVO(
                id = 1,
                name = "Saw Phyo Wai",
                price = "1200",
                value = 1
            )
        }

        fun orderList():List<CheckOutDataVO>{
            return listOf(
                CheckOutDataVO(
                    id = 1,
                    name = "Saw Phyo Wai",
                    price = "1200",
                    value = 1
                ),
                CheckOutDataVO(
                    id = 2,
                    name = "Saw Phyo Wai",
                    price = "1200",
                    value = 1
                ),
                CheckOutDataVO(
                    id = 3,
                    name = "Saw Phyo Wai",
                    price = "1200",
                    value = 1
                ),
                CheckOutDataVO(
                    id = 4,
                    name = "Saw Phyo Wai",
                    price = "1200",
                    value = 1
                )

            )
        }
    }
}
