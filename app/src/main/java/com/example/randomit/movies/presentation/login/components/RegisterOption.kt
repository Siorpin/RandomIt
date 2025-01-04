package com.example.randomit.movies.presentation.login.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun RegisterOption(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
)
{
    TextButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(
            text = text,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Left
        )
    }
}
