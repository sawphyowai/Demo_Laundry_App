package com.example.laundry_demo.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.R
import com.example.laundry_demo.compoment.AuthFooterScreen
import com.example.laundry_demo.compoment.AuthProvideBottom
import com.example.laundry_demo.compoment.AuthScreenHeader
import com.example.laundry_demo.compoment.LaundryButton
import com.example.laundry_demo.compoment.LaundryEditText
import com.example.laundry_demo.presenter.LoginViewModel
import com.example.laundry_demo.repository.splash.LoginNavigator
import com.example.laundry_demo.repository.splash.LoginNavigatorImpl
import com.example.laundry_demo.state.LoginSate
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@Composable
fun LoginScreen(
    modifier: Modifier=Modifier,
    viewModel:LoginViewModel
    ) {


    val loginState by remember {
        viewModel.loginSate
    }

    LoginScreenStateLess(modifier=modifier,
        loginState,
        viewModel::onChangeEmail,
        viewModel::onChangePassword,
        viewModel::navigateToRegister,
        viewModel::navigateToHome
        )
}

@Composable
fun LoginScreenStateLess(
    modifier: Modifier,
    loginState: LoginSate,
    onChangeEmail: (String) -> Unit,
    onChangePassword: (String) -> Unit,
    navigateToRegister: () -> Unit,
    navigateToHome: () -> Unit
) {
    Scaffold(modifier=modifier) {value->
        Column (
            modifier= Modifier
                .background(MaterialTheme.colorScheme.surface)
                .fillMaxSize()
                .padding(value)
                .padding(20.dp)
            ,
        ){
            AuthScreenHeader(
                label= stringResource(id = R.string.letGet),
                subLabel = stringResource(id = R.string.loginAccount),
                modifier=Modifier.padding(vertical = 20.dp)
            )

            LaundryEditText(label =
            stringResource(id = R.string.email) ,
                value =loginState.email ,
                onTextChange =onChangeEmail ,
                placeHolder ="eg@gmail.com",
                modifier =Modifier.fillMaxWidth(),
                keyBoardType= KeyboardType.Email
            )

            Spacer(modifier = Modifier.height(20.dp))

            LaundryEditText(label =
            stringResource(id = R.string.email) ,
                value =loginState.password ,
                onTextChange =onChangePassword ,
                placeHolder ="******",
                modifier =Modifier.fillMaxWidth(),
                keyBoardType= KeyboardType.Password
                
            )

            Spacer(modifier = Modifier.height(20.dp))

            TextButton(onClick = {

            },
                modifier= Modifier.align(Alignment.End)
            ) {
                Text(
                    text = stringResource(id = R.string.forgetPassword),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.primary,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))

            LaundryButton(label = stringResource(id = R.string.login),
                modifier=Modifier.fillMaxWidth(),
                isCheckReverse=true,
                onClick = navigateToHome
            )

            Spacer(modifier = Modifier.height(20.dp))

            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.textButtonColors(
                    contentColor= Color.Gray
                )
            ) {
                Text(
                    text = stringResource(id = R.string.account),
                )
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row{
                AuthProvideBottom(label = 
                stringResource(id = R.string.google),
                    imageView =
                    ImageVector.vectorResource(id = R.drawable.ic_google),
                    modifier = Modifier.weight(1f)
                ){

                }
                Spacer(modifier = modifier.width(8.dp))
                AuthProvideBottom(label =
                stringResource(id = R.string.facebook),
                    imageView =ImageVector.vectorResource(id = R.drawable.ic_facebook),
                    modifier = Modifier.weight(1f)

                ){

                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            AuthFooterScreen(
                modifier=Modifier.align(Alignment.CenterHorizontally),
                label = stringResource(id = R.string.askAccount),
                subLabel = stringResource(id = R.string.register),
                onClick = navigateToRegister
                )

        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    Laundry_demoTheme {
        LoginScreen(
            viewModel = LoginViewModel(
                loginNavigator = LoginNavigatorImpl()
            )
        )
    }
}