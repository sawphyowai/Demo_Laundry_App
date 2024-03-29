package com.example.laundry_demo.compoment

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.profile.ProfileState

@Composable
fun ProfileBody(modifier: Modifier, profileState: ProfileState) {
    Column (
        modifier,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        ){

        Image(
            modifier = Modifier
                .border(
                    BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                    CircleShape
                )
                .clip(CircleShape)
                .size(100.dp),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = profileState.profile.profile),
            contentDescription =null )

        Text(text =  profileState.profile.name,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp
            )

        Text(
            text = "ID : ${profileState.profile.id}",
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
            )
    }
}

//@Preview
//@Composable
//fun ProfileBodyPreview() {
//    Laundry_demoTheme {
//        ProfileBody(
//            Modifier
//                .background(color = MaterialTheme.colorScheme.surface),
//            profileState
//        )
//    }
//}