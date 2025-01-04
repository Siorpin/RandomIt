package com.example.randomit.movies.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.randomit.R
import com.example.randomit.movies.presentation.login.components.LoginOption
import com.example.randomit.movies.presentation.login.components.RegisterOption
import com.example.randomit.ui.theme.RandomItTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box (
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .padding(horizontal = 50.dp)
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
                iconRes = R.drawable.google,
                onClick = {}
            )
            LoginOption(
                text = "E-mail",
                backgroundColor = MaterialTheme.colorScheme.primary,
                icon = Icons.Default.Email,
                onClick = {}
            )
            RegisterOption(
                text = "Don't have an account...",
                onClick = {}
            )
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview(modifier: Modifier = Modifier) {
    RandomItTheme {
        LoginScreen()
    }
}