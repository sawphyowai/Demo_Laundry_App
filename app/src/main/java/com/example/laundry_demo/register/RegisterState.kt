package com.example.laundry_demo.register

data class RegisterState(
    val name:String,
    val email:String,
    val password:String
){
    companion object{
        fun default():RegisterState{
            return RegisterState(
                name = "",
                email = "",
                password = ""
            )
        }
    }
}
