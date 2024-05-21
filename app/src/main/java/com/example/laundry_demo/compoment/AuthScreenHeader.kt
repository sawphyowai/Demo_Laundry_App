package com.example.laundry_demo.compoment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laundry_demo.R
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@Composable
fun ColumnScope.AuthScreenHeader(
    label:String,
    subLabel:String,
    modifier: Modifier=Modifier
) {
    Image(
        painter = painterResource(
        id = R.drawable.logo),
        contentDescription =null,
        modifier=modifier.align(Alignment.End)

        )
    Text(
        text = label,
        fontWeight = FontWeight.Medium,
        fontSize = 30.sp
        )

    Spacer(modifier = Modifier.height(8.dp))
    Text(text =subLabel,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    )
    Spacer(modifier = modifier.height(8.dp))
    
}

@Preview
@Composable
fun AuthScreenHeaderPreview() {
    Laundry_demoTheme {
        Column(modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)) {
            AuthScreenHeader(
                "Lets's get started",
                "login your account"
                )
        }
    }
}


@Composable
fun AuthFooterScreen(
    label:String,
    subLabel: String,
    modifier: Modifier=Modifier,
    onClick:() -> Unit ={},
) {
    TextButton(onClick = onClick,
        modifier = modifier
        ) {
        Text(
            text = label,
            color = Color.Gray
            )
        Text(
            modifier = Modifier.padding(horizontal = 8.dp),
            text = subLabel,
        )
    }
}

@Preview
@Composable
fun AuthFooterScreenPreview() {
    Laundry_demoTheme {
        AuthFooterScreen(
            label="Don't have an account?",
            subLabel="Register",
            modifier = Modifier.fillMaxWidth().background(color = MaterialTheme.colorScheme.surface)
        )

    }
}




