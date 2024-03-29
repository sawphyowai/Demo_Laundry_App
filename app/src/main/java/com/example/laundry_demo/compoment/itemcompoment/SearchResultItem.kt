package com.example.laundry_demo.compoment.itemcompoment

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.chat.ChatDataVo

@Composable
fun SearchResultItem(
    modifier: Modifier,
    chatDataVO:ChatDataVo
) {
    Row(
        modifier=modifier.padding(5.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
        ){

        Image(
            modifier = Modifier
                .border(
                    BorderStroke(
                        2.dp,
                        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.2f)
                    ), CircleShape
                )
                .clip(CircleShape)
                .size(50.dp)
            ,
            contentScale = ContentScale.Crop,
            painter = painterResource(id = chatDataVO.profile),
            contentDescription = null)

        Column (
            modifier = Modifier.weight(2f),
            verticalArrangement = Arrangement.spacedBy(5.dp)
            ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = chatDataVO.name,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 16.sp,
                    modifier=modifier.weight(3f)
                )
                Text(
                    text = chatDataVO.date,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    textAlign = TextAlign.End,
                    modifier=modifier.weight(2f)
                )
            }

            Text(
                text = chatDataVO.message,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
                )
        }

    }
}

@Preview
@Composable
fun SearchResultItemPreview() {
    Laundry_demoTheme {
        SearchResultItem(
           modifier =  Modifier.fillMaxWidth().background(color = MaterialTheme.colorScheme.surface),
                    ChatDataVo.idle()

        )
    }
}

