package com.example.laundry_demo.payment

import androidx.annotation.DrawableRes
import com.example.laundry_demo.R

data class PaymentDataVO(
    val id:Int,
    val name:String,
    @DrawableRes
    val image:Int,
    val isCheck:Boolean
){
    companion object{
        fun paymentList():List<PaymentDataVO>{
            return  listOf(
                PaymentDataVO(
                    id=1,
                    name = "Apple Pay",
                    image =R.drawable.ic_apple,
                    isCheck = true
                )  ,
                PaymentDataVO(
                    id=2,
                    name = "Credit Card",
                    image =R.drawable.ic_credit_card,
                    isCheck = false
                )  ,
                PaymentDataVO(
                    id=3,
                    name = "PayPal",
                    image =R.drawable.ic_paypal,
                    isCheck = false
                )  ,
            )
        }
    }
}
