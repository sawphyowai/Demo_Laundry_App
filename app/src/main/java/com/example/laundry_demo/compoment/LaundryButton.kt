package com.example.laundry_demo.compoment

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme


@Composable
fun LaundryButton(
    label:String,
    modifier: Modifier= Modifier,
    isCheckReverse:Boolean=false,
    onClick:() -> Unit ={},
) {
    Button(
        modifier = modifier
            .height(45.dp),
        colors = ButtonDefaults.buttonColors (
            containerColor =
            if(isCheckReverse){
                MaterialTheme.colorScheme.primary
            }else{
                MaterialTheme.colorScheme.surface
            }
            ,
            contentColor = if(isCheckReverse){
                MaterialTheme.colorScheme.surface
            }else{
                MaterialTheme.colorScheme.primary

            }
        ),
        shape = RoundedCornerShape(20),
        onClick = onClick,
    ) {
        Text(text = label)
    }
}

@Preview
@Composable
fun LaundryButtonPreviewWithTrue(){
    Laundry_demoTheme {
        LaundryButton("Get Started",
            modifier = Modifier.fillMaxWidth(),
            isCheckReverse = true
        )
    }
}
@Preview
@Composable
fun LaundryButtonPreviewWithFalse(){
    Laundry_demoTheme {
        LaundryButton("Get Started",
            modifier = Modifier.fillMaxWidth(),
            isCheckReverse = false

            )
    }
}

@Composable
fun AuthProvideBottom(
    label:String,
    imageView:ImageVector,
    modifier: Modifier=Modifier,
    onChange:() -> Unit ={}
) {
    OutlinedButton(
        onClick = onChange,
        modifier=modifier,
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(0.5.dp,
            color = Color.Gray.copy(
                alpha = 0.5f
            )))
        {
        Image(imageVector = imageView,
            contentDescription = null,
            modifier = Modifier.size(30.dp).padding(horizontal = 2.dp))
        Text(
            text = label,
            fontWeight = FontWeight.Medium
            )
    }
}

@Preview
@Composable
fun AuthProvideBottomPreview() {
    Laundry_demoTheme {
        AuthProvideBottom(
            label="Google",
            imageView = Icons.Default.Settings,
            modifier= Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surface)
            ,
        )
    }
}