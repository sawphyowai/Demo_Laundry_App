package com.example.laundry_demo.ui.splashscreen

import android.util.Log.d
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.R
import com.example.laundry_demo.compoment.LaundryButton
import com.example.laundry_demo.presenter.SplashViewModel
import com.example.laundry_demo.repository.splash.SplashNavigatorImpl
import com.example.laundry_demo.ui.theme.Laundry_demoTheme


@Composable
fun SplashScreen(
    modifier:Modifier=Modifier,
    viewModel:SplashViewModel
    ) {
    SplashScreenStateLess(
        modifier=modifier,
        viewModel::navigateToLogin
    )
}

@Composable
fun SplashScreenStateLess(
    modifier: Modifier,
    navigateToLogin: () -> Unit) {
    Scaffold (modifier=modifier){value->
        Column(modifier= Modifier
            .padding(value)
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary),
            verticalArrangement = Arrangement.SpaceAround
        ) {

            Image(
                modifier=Modifier.weight(1f),
                contentScale = ContentScale.FillWidth,
                painter = painterResource(id = R.drawable.boarding_image),
                contentDescription =null )

            Text(text = stringResource(id = R.string.spl1),
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Medium,
                lineHeight = 40.sp,
                modifier= Modifier
                    .padding(
                        horizontal = 20.dp
                    )
                    .padding(top = 20.dp)
            )


            Text(text =
            stringResource(id = R.string.spl2),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 20.sp,
                modifier= Modifier
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp)
            )


            LaundryButton(label = stringResource(id =
            R.string.getStart
            ),
                isCheckReverse = false,
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp)
                    .padding(bottom = 20.dp),
                onClick = navigateToLogin
            )

        }
    }

}

@Preview
@Composable
fun SplashScreenPreview() {
    Laundry_demoTheme {
        SplashScreen(viewModel = SplashViewModel(
            splashNavigation = SplashNavigatorImpl()
        )
        )
    }
}