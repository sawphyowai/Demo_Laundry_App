package com.example.laundry_demo.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.laundry_demo.compoment.ProfileBody
import com.example.laundry_demo.compoment.ProfileTopAdapter
import com.example.laundry_demo.compoment.itemcompoment.ProfileItem
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.presenter.ProfileViewModel

@Composable
fun ProfileScreen(modifier: Modifier=Modifier) {
    val viewModel:ProfileViewModel = viewModel()
    val profileState by remember{
        viewModel.profileState
    }
    ProfileStateless(
        modifier,
        profileState,
        viewModel::onChangeAccount,
        viewModel::onChangeLanguage,
        viewModel::onChangeNotification,
        viewModel::onChangePreference,
        viewModel::onChangeHelp
    )
}

@Composable
fun ProfileStateless(
    modifier: Modifier,
    profileState: ProfileState,
    onChangeAccount: () -> Unit,
    onChangeLanguage: () -> Unit,
    onChangeNotification: () -> Unit,
    onChangePreference: () -> Unit,
    onChangeHelp: () -> Unit,

    ) {
    Scaffold(
        modifier=modifier.fillMaxWidth(),
        topBar ={
            ProfileTopAdapter()
        }
    ) {value->
        LazyColumn(
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(value)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ){

            item{
                ProfileBody(
                    modifier = Modifier.fillMaxWidth(),
                    profileState=profileState)
            }

            item{
                ProfileItem(
                    leadingIcon=ImageVector.vectorResource(id =R.drawable.ic_outline_person ),
                    labelName= stringResource(id = R.string.userAccount),
                    onCLick=onChangeAccount
                )
                ProfileItem(
                    leadingIcon=ImageVector.vectorResource(id =R.drawable.ic_language ),
                    labelName=stringResource(id = R.string.Language),
                    onCLick=onChangeLanguage

                )
                ProfileItem(
                    leadingIcon=Icons.Default.Notifications,
                    labelName=stringResource(id = R.string.Notification),
                    onCLick=onChangeNotification
                )
                ProfileItem(
                    leadingIcon=Icons.Default.Settings,
                    labelName=stringResource(id = R.string.Preference),
                    onCLick=onChangePreference

                )
                ProfileItem(
                    leadingIcon=Icons.Default.Info,
                    labelName=stringResource(id = R.string.Help),
                    onCLick=onChangeHelp
                )
            }
        }
    }
}

@Preview
@Composable
fun ProfilePreview() {
    Laundry_demoTheme {
        ProfileScreen()
    }
}