package com.example.laundry_demo.home

import android.util.Log.d
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.compoment.HomeTopAppBar
import com.example.laundry_demo.compoment.LaundryCardView
import com.example.laundry_demo.compoment.Search
import com.example.laundry_demo.compoment.itemcompoment.LaundryItem
import com.example.laundry_demo.presenter.HomeViewModel
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.repository.splash.HomeNavigatorImpl


@Composable
fun HomeScreen(
    modifier:Modifier=Modifier,
    viewModel:HomeViewModel
    ) {
    val homeState by remember{
        viewModel.homeState
    }
    HomeScreenStateLess(
        modifier = modifier,
        homeState,
        viewModel::search,
        viewModel::navigateToCheckOut
        )
}



@Composable
fun HomeScreenStateLess(
    modifier: Modifier,
    homeState: HomeState,
    search: (String) -> Unit,
    navigatedToCheckout: () -> Unit
) {
    Scaffold(
        modifier = modifier.fillMaxWidth(),
        topBar = {
            HomeTopAppBar(modifier = modifier)
        }
    ) {value->
        LazyColumn(modifier= modifier
            .padding(value)
            .padding(20.dp)
            .fillMaxWidth()){
            item{
                Search(value = homeState.search, modifier =
                Modifier
                    .fillMaxWidth()
                    , placeHolder = stringResource(id = R.string.findNearestLaundry)
                    , onChange = search,
                    keyBoardType = KeyboardType.Text
                    )
            }

            item{
                LaundryCardView (){
                }
            }

            item{
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(3f),
                        text = stringResource(id = R.string.nearestLaundry),
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                    )
                    Text(
                        modifier= Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        text = stringResource(id = R.string.seeMore),
                        textAlign = TextAlign.End,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.primary

                    )
                }
            }
            item{
                LazyRow(){
                    items(homeState.itemList){ item->
                        LaundryItem(modifier =Modifier.padding(top=10.dp,end = 10.dp),
                            item = item,
                            navigatedToCheckOut = navigatedToCheckout
                            )
                    }
                }

            }

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    Laundry_demoTheme {
        HomeScreen(
            viewModel= HomeViewModel(
                homeNavigator = HomeNavigatorImpl()
            )
        )
    }
}