package com.example.achadin01.components

import com.example.achadin01.R

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.achadin01.ui.theme.Achadin01Theme
import com.example.achadin01.ui.theme.AchadinColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    Surface(shadowElevation = 20.dp,
        modifier = Modifier.fillMaxWidth()) {
        CenterAlignedTopAppBar(
            title = {
                Icon(painter = painterResource(id = R.drawable.achadin_vetor),
                    contentDescription = "achadin_title")
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = AchadinColor,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White
            ),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(modifier = Modifier.size(35.dp),
                        imageVector = Icons.Filled.KeyboardArrowLeft,
                        contentDescription = "back_buttom_app_bar" )
                }
            }
        )
    }
}

@Preview
@Composable
fun PreviewTopAppBar() {
    TopAppBar()
}

