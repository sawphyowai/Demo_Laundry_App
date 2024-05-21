package com.example.laundry_demo.chat

import com.example.laundry_demo.R

data class ChatDataVo(
    val profile:Int,
    val name:String,
    val message:String,
    val date:String
){
    companion object{
        fun idle() = ChatDataVo(
            profile = R.drawable.placeholder_person,
            name = "Mr Global Knight",
            message = "We generation Z fight for democracy.I fuck out all of detarship",
            date = "12/12/2024"
        )


        }
}
