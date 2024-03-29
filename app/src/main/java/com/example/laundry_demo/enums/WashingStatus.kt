package com.example.laundry_demo.enums

sealed class WashingStatus(val laundryStatus:LaundryStatus,val label:String){
    class Washing(private val status:LaundryStatus,private val name: String):WashingStatus(status,name)
    class Cleaning(private val status:LaundryStatus,private val name: String):WashingStatus(status,name)
    class Drying(private val status:LaundryStatus,private val name: String):WashingStatus(status,name)
    class Delivery(private val status:LaundryStatus,private val name: String):WashingStatus(status,name)
}

