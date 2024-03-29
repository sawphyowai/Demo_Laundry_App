package com.example.laundry_demo.compoment.itemcompoment

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R
import com.example.laundry_demo.home.LaundryDaVo

@Composable
fun LaundryItem(
    modifier: Modifier=Modifier,
    item:LaundryDaVo,
    navigatedToCheckOut:()-> Unit
    ) {
   Card (
       modifier= modifier
           .width(250.dp)
           .clickable {
               navigatedToCheckOut()
           },
       shape=MaterialTheme.shapes.medium,
       elevation = CardDefaults.cardElevation(
           defaultElevation=2.dp
       ),
       colors = CardDefaults.cardColors(
           containerColor = MaterialTheme.colorScheme.surface
       )
       ){

       Image(
           modifier= Modifier
               .width(250.dp)
               .height(150.dp)
               .clip(RoundedCornerShape(percent = 10)),
           painter = painterResource(id = R.drawable.placeholder_laundry_machine) ,
           contentScale = ContentScale.Crop,
           contentDescription = null)

       Spacer(modifier = Modifier.height(20.dp))

       Text(text =item.name,
           modifier=Modifier.padding(start = 10.dp),
           fontSize = 20.sp,
           fontWeight = FontWeight.Medium,
       )

       Row(
           modifier =Modifier.padding( 10.dp),
           verticalAlignment = Alignment.CenterVertically
       ){
           Icon(
               modifier = Modifier.size(15.dp),
               imageVector = Icons.Default.Place ,
               contentDescription = null,
               tint = MaterialTheme.colorScheme.primary
           )

           Spacer(modifier = Modifier.width(3.dp))

           Text(text = item.place,
               maxLines = 1,
               overflow = TextOverflow.Ellipsis
               )

           Spacer(modifier = Modifier.width(30.dp))
           
           Text(text = buildAnnotatedString {
               append(buildAnnotatedString{
                   val text="\$${item.price}"
                   addStyle(
                       SpanStyle(
                           fontWeight = FontWeight.Medium,
                           fontSize = 20.sp
                       )
                       ,start = 0, end = text.length
                   )
                   append(text)
               })
               append("/pcs")
           })

       }
   }
}

@Preview
@Composable
fun LaundryItemPreview() {
    Laundry_demoTheme {
        LaundryItem(
            Modifier,
            LaundryDaVo.itemDefault(),
            {})
    }
}