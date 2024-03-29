package com.example.laundry_demo.chat

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.laundry_demo.R
import com.example.laundry_demo.compoment.ChatTopAdapter
import com.example.laundry_demo.compoment.Search
import com.example.laundry_demo.compoment.itemcompoment.SearchResultItem
import com.example.laundry_demo.presenter.ChatViewModel
import com.example.laundry_demo.ui.theme.Laundry_demoTheme


@Composable
fun ChatScreen(modifier:Modifier=Modifier) {
    val viewModel:ChatViewModel = viewModel()
    val chatState by remember{
        viewModel.searchState
    }
    ChatScreenStateLess(
        modifier=modifier,
        chatState=chatState,
        onSearch=viewModel::search
        )
}

@Composable
fun ChatScreenStateLess(
    modifier: Modifier,
    chatState: ChatState,
    onSearch: (String) -> Unit
) {
    Scaffold (
        topBar = {
            ChatTopAdapter()
        }
    ){value->
        LazyColumn(
            modifier = Modifier
                .padding(value)
                .padding(5.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ){
            item{
                Search(value =chatState.search, modifier =
                Modifier
                    .fillMaxWidth()
                    , placeHolder = stringResource(id = R.string.searchInChat)
                    , onChange = onSearch,
                    keyBoardType = KeyboardType.Text
                )
            }
            item{
                val contentColor= LocalContentColor.provides(Color.Gray)
                CompositionLocalProvider(values = arrayOf(contentColor)) {
                    Row(){
                        Icon(imageVector =
                        Icons.Default.ArrowDropDown
                            , contentDescription = null)
                        Text(text = stringResource(id = R.string.pinMessage))
                    }
                }
            }
            items(chatState.searchListWithPin){item->
                SearchResultItem(
                    modifier =Modifier,
                    chatDataVO=item
                    )
            }
            item {
                val contentColor= LocalContentColor.provides(value = Color.Gray)
                CompositionLocalProvider(values = arrayOf(contentColor)) {
                    Column {
                        Text(text =
                        stringResource(id = R.string.allMessages),
                            modifier=Modifier.padding(start = 10.dp)
                            )
                    }
                }
            }
            items(chatState.searchListAll){item->
                SearchResultItem(
                    modifier =Modifier,
                    chatDataVO=item
                )
            }
        }
    }
}

@Preview
@Composable
fun ChatScreenPreview() {
    Laundry_demoTheme {
        ChatScreen()
    }
}