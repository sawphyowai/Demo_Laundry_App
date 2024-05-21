package com.example.laundry_demo.state

data class LoginSate(
    val email:String,
    val password:String
){
    companion object{
        fun default():LoginSate{
           return LoginSate(
                email = "",
                password = "")
        }
    }
}
