package com.example.laundry_demo.compoment.itemcompoment

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R

@Composable
fun ProfileItem(
    modifier: Modifier=Modifier,
    leadingIcon:ImageVector,
    labelName:String,
    onCLick:() -> Unit ={}
    ) {
    Card (
        modifier= Modifier
            .padding(vertical = 10.dp)
            .clickable {
                onCLick
            },
        shape = MaterialTheme.shapes.small,
        elevation=CardDefaults.cardElevation(
            defaultElevation=1.dp
        )
    ){
        Row(
            modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.05f)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Icon(
                modifier= Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .padding(10.dp),
                imageVector = leadingIcon,
                tint = MaterialTheme.colorScheme.primary.copy(alpha = 0.9f),
                contentDescription = null)
            Text(
                text = labelName,
                modifier=Modifier.weight(3f)
            )
            Icon(
                modifier=Modifier.weight(1f),
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
            )
        }
    }
}

@Preview
@Composable
fun ProfileItemPreview() {
    Laundry_demoTheme {
        ProfileItem(
            Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surface),
            leadingIcon=ImageVector.vectorResource(id = R.drawable.ic_language),
            labelName="Setting"
            )
    }
}