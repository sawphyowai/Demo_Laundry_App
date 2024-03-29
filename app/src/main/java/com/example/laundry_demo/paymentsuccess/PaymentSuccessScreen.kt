package com.example.laundry_demo.paymentsuccess

import android.app.Activity
import android.os.Build
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.compoment.LaundryButton
import com.example.laundry_demo.presenter.PaymentSuccessViewModel
import com.example.laundry_demo.repository.splash.PaymentSuccessNavigatorImpl

@Composable
fun PaymentSuccessScreen(
    viewModel: PaymentSuccessViewModel) {
    val lottieAnimation by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.anim_success)
    )

    BackHandler {
        viewModel.navigateToBack()
    }

    PaymentSuccessScreenStateLess(
        lottieAnimation,
        viewModel::navigateToBack,
        viewModel::navigateToDetail
        )
}


@Composable
fun PaymentSuccessScreenStateLess(
    lottieAnimation: LottieComposition?,
    navigateToBack: () -> Unit,
    navigateToDetail: () -> Unit
) {
    val modifier= Modifier
        .fillMaxWidth()
        .height(70.dp)
        .padding(8.dp)

    Scaffold(modifier = Modifier.fillMaxSize()) {value ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.primary)
                .padding(value)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            LottieAnimation(
                modifier = Modifier,
                composition =lottieAnimation,
                iterations= LottieConstants.IterateForever
            )

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.paymentSuccess),
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = MaterialTheme.colorScheme.surface
                )

                Text(text = stringResource(id = R.string.paymentSuccessContent),
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    color = MaterialTheme.colorScheme.surface,
                    textAlign = TextAlign.Center
                )
            }

            Column (
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                LaundryButton(
                    modifier = modifier,
                    label = stringResource(id = R.string.detailOrder),
                    onClick=navigateToDetail
                )

                OutlinedButton(
                    modifier = modifier,
                    onClick = navigateToBack,
                    shape = MaterialTheme.shapes.small,
                    colors =ButtonDefaults.outlinedButtonColors(
                        contentColor = MaterialTheme.colorScheme.surface
                    ),
                    border = BorderStroke(1.dp, Color.White)
                ) {
                    Text(text = stringResource(id = R.string.backHome))
                }

            }

        }
    }

}

@Preview
@Composable
fun PaymentSuccessPreview() {
    Laundry_demoTheme {
        PaymentSuccessScreen(
            viewModel = PaymentSuccessViewModel(
                paymentSuccessNavigator = PaymentSuccessNavigatorImpl()
            )
        )
    }
}