package com.example.laundry_demo.route

sealed class RootRoute (var route:String){
    companion object{
        const val splash="/splash"
        const val login="/login"
        const val main="/main"
        const val checkout="/checkout"
        const val payment="/payment"
        const val paymentSuccess="/paymentSuccess"
        const val orderDetail="/orderDetail"
    }
}

