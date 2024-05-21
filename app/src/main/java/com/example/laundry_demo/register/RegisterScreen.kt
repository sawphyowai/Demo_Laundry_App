package com.example.laundry_demo.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.compoment.AuthFooterScreen
import com.example.laundry_demo.compoment.AuthScreenHeader
import com.example.laundry_demo.compoment.LaundryButton
import com.example.laundry_demo.compoment.LaundryEditText
import com.example.laundry_demo.presenter.RegisterViewModel
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.repository.splash.RegisterNavigatorImpl


@Composable
fun RegisterScreen(
    modifier: Modifier=Modifier,
    viewModel: RegisterViewModel
    ) {

    val registerState by remember {
        viewModel.registerState
    }

    RegisterScreenStateLess(
        modifier,
        registerState,
        viewModel::onChangeName,
        viewModel::onChangeEmail,
        viewModel::onChangePassword,
        viewModel::navigateToLogin,
        viewModel::navigatedToHome
        )
}

@Composable
fun RegisterScreenStateLess(
    modifier: Modifier,
    registerState: RegisterState,
    onChangeName: (String) -> Unit,
    onChangeEmail: (String) -> Unit,
    onChangePassword: (String) -> Unit,
    navigateToLogin: () -> Unit,
    navigatedToHome: () -> Unit,
    ) {
    Column(
        modifier= modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(20.dp)
    ) {

        AuthScreenHeader(label = stringResource(id = R.string.register),
            subLabel = stringResource(id = R.string.createNewAccount))

        Spacer(modifier = Modifier.weight(0.5f))

        LaundryEditText(label = stringResource(id=R.string.name),
            value = registerState.name,
            onTextChange = onChangeName,
            placeHolder = stringResource(id=R.string.name),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        LaundryEditText(label = stringResource(id=R.string.email),
            value = registerState.email,
            onTextChange = onChangeEmail,
            placeHolder = "eg@emil.com",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        LaundryEditText(label = stringResource(id=R.string.password),
            value = registerState.password,
            onTextChange = onChangePassword,
            placeHolder = "*****",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(50.dp))

        LaundryButton(
            label = stringResource(id = R.string.register),
            isCheckReverse = true,
            modifier = modifier.fillMaxWidth(),
            onClick = navigatedToHome
        )

        Spacer(modifier = Modifier.weight(1f))

        AuthFooterScreen(
            label = stringResource(id = R.string.alreadyAccount),
            subLabel = stringResource(id = R.string.login),
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            onClick = navigateToLogin
        )
    }
}

@Preview
@Composable
fun RegisterScreenPreview() {
    Laundry_demoTheme {
        RegisterScreen(
            modifier = Modifier,
            viewModel = RegisterViewModel(
                registerNavigator = RegisterNavigatorImpl()
            )
            )
    }
}