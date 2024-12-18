package com.example.randomit.moveis.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.randomit.R
import com.example.randomit.moveis.presentation.login.components.LoginOption
import com.example.randomit.moveis.presentation.login.components.RegisterOption

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box (
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Random It",
                fontSize = 44.sp,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(20.dp))
            LoginOption(
                text = "Google",
                backgroundColor = Color.Red,
                icon = R.drawable.google,
                onClick = {}
            )
            LoginOption(
                text = "Facebook",
                backgroundColor = Color.Blue,
                icon = R.drawable.facebook,
                onClick = {}
            )
            LoginOption(
                text = "Service Account",
                backgroundColor = Color.White,
                icon = ,
                onClick = {}
            )
            RegisterOption(
                text = "Don't have an account...",
                onClick = {}
            )
        }
    }
}