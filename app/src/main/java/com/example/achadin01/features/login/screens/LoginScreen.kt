package com.example.achadin01.features.login.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.achadin01.R
import com.example.achadin01.components.TextFieldCustomer

import com.example.achadin01.components.TopAppBar
import com.example.achadin01.ui.theme.AchadinColor

@Composable
fun LoginScreen() {
    LoginContent()
}

@Composable
fun LoginContent() {

    val fontPadrão = FontFamily(Font(R.font.sulphur_point))

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar()
        Spacer(modifier = Modifier.height(100.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo_app"
        )
        Text(
            text = "Faça seu login",
            fontFamily = fontPadrão,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.padding(10.dp)
        )
        TextFieldCustomer(
            value = email,
            onValueChange = {email = it},
            textLabel = "E-mail"
        )
        TextFieldCustomer(
            value = password,
            onValueChange = {password = it},
            textLabel = "Senha"
        )
        Spacer(modifier = Modifier.height(35.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.elevatedButtonColors(AchadinColor),
            modifier = Modifier
                .width(188.dp)
                .height(45.dp)) {
            Text(
                text = "Entrar",
                textAlign = TextAlign.Center,
                fontFamily = fontPadrão,
                fontWeight = FontWeight.Bold,
                fontSize = 21.sp,
                color = Color.White,
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { /*TODO*/ }) {
            Text(text = "Esqueci minha senha",
                fontFamily = fontPadrão,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
            )
            Icon(imageVector = Icons.Filled.KeyboardArrowRight,
                contentDescription = null
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { /*TODO*/ }) {
            Text(text = "Primeiro acesso",
                fontFamily = fontPadrão,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Icon(imageVector = Icons.Filled.KeyboardArrowRight,
                contentDescription = null,
            )
        }
    }
}


@Preview
@Composable
fun LoginPreview() {
    LoginContent()
}