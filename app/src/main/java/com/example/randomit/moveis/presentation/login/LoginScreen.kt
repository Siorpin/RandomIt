package com.example.randomit.moveis.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.randomit.moveis.presentation.login.components.LoginOption

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = "Log in",
            fontSize = 44.sp
        )
        LoginOption(
            text = "Google",
            backgroundColor = Color.Red,
            onClick = {}
        )
    }
}