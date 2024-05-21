package com.example.laundry_demo.compoment

import android.widget.ImageView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.ui.theme.Laundry_demoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColumnScope.LaundryEditText(
    label:String,
    value:String,
    onTextChange:(String) -> Unit,
    keyBoardType:KeyboardType= KeyboardType.Text,
    placeHolder:String,
    modifier: Modifier=Modifier
) {
    Text(text = label)
    Spacer(modifier = Modifier.height(8.dp))
    OutlinedTextField(
        modifier = modifier,
        value =value ,
        onValueChange =onTextChange,
        keyboardOptions= KeyboardOptions(keyboardType=keyBoardType),
        placeholder={
            Text(text = placeHolder)
        },
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.Black.copy(alpha = 0.5f),
        )
    )
}





@Preview
@Composable
fun LaundryEditTextPreview() {
    Laundry_demoTheme {
        var value by remember{
            mutableStateOf("")
        }
        Column (modifier =
        Modifier
            .background(MaterialTheme.colorScheme.surface)
            .fillMaxWidth()
            ){
            LaundryEditText(
                label = "Email",
                value = value,
                onTextChange = {value=it},
                placeHolder = "g.email.com",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun Search(
    value:String,
    modifier: Modifier,
    placeHolder:String,
    keyBoardType: KeyboardType=KeyboardType.Text,
    onChange:(String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange =onChange,
        modifier = modifier,
        keyboardOptions = KeyboardOptions(keyboardType = keyBoardType),
        leadingIcon={
            Icon(imageVector = Icons.Default.Search,
                contentDescription = null)
          },
        placeholder = {
            Text(text =placeHolder )
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = MaterialTheme.colorScheme.primary,
            unfocusedTextColor=Color.Black
        )

        )
}

@Preview
@Composable
fun SearchPreview() {
    Laundry_demoTheme {
        Search(value="Search",
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.surface),
            placeHolder = "Find the nearest laundry",
            onChange = {})
    }
}