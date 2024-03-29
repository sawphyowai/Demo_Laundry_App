package com.example.laundry_demo.history

data class HistoryState(
    val historyList:List<HistoryDataVO> = list()
)
{
    companion object{
        fun list():List<HistoryDataVO>{
            return listOf(
                HistoryDataVO.idle(),
                HistoryDataVO.idle(),
                HistoryDataVO.idle(),
                HistoryDataVO.idle()
            )
        }
    }
}
