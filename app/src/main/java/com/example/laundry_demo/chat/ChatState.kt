package com.example.laundry_demo.chat

data class ChatState(
    val search:String="",
    val searchListWithPin:List<ChatDataVo> = listOf(ChatDataVo.idle(), ChatDataVo.idle()),
    val searchListAll:List<ChatDataVo> = listOf(ChatDataVo.idle(), ChatDataVo.idle(),
        ChatDataVo.idle(), ChatDataVo.idle(), ChatDataVo.idle())
)
