package com.example.laundry_demo.payment

data class PaymentState(
    var isCheckService:Boolean = true,
    var isCheckDeliveryService:Boolean=false,
    val paymentList:List<PaymentDataVO> = PaymentDataVO.paymentList()
)
