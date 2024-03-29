package com.example.laundry_demo.profile

import com.example.laundry_demo.R

data class UserDataVO(
    val id:String,
    val name:String,
    val profile:Int
){
    companion object{
        fun idle():UserDataVO{
            return UserDataVO(
                id="+969 31616077",
                name = "Global Knight",
                profile = R.drawable.placeholder_person
            )
        }
    }
}
