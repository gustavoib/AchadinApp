package com.example.achadin01.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.achadin01.ui.theme.AchadinColor

@Composable
fun TextFieldCustomer(value: String, onValueChange: (String) -> Unit, textLabel: String) {
    OutlinedTextField(value = value,
        onValueChange = onValueChange,
        label = { Text(text = textLabel, color = Color(0xFFF80059)) },
        visualTransformation = PasswordVisualTransformation(),
        colors = customTextFieldColor(),
        modifier = Modifier
            .padding(bottom = 8.dp, top = 8.dp)
            .width(300.dp)
    )
}

@Composable
fun customTextFieldColor() = TextFieldDefaults.colors(
    focusedIndicatorColor = AchadinColor,
    unfocusedContainerColor = Color.White,
    focusedContainerColor = Color.White
)


