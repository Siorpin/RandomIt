package com.example.randomit.movies.presentation.login.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.randomit.R
import com.example.randomit.ui.theme.RandomItTheme

@Composable
fun LoginOption(
    text: String,
    backgroundColor: Color,
    @DrawableRes iconRes: Int? = null,
    icon: ImageVector? = null,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth()
            .shadow(
                shape = RoundedCornerShape(12.dp),
                spotColor = backgroundColor,
                elevation = 8.dp,
                ambientColor = backgroundColor
            )
            .background(
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(12.dp)
            )
            .border(
                color = backgroundColor,
                width = 1.dp,
                shape = RoundedCornerShape(12.dp)
            )
            .height(40.dp)
            .clickable { onClick() }
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            if(iconRes != null) {
                Icon(
                    painter = painterResource(iconRes),
                    contentDescription = text,
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .size(25.dp)
                        .weight(1f)
                )
            }
            else if (icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = text,
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .size(25.dp)
                        .weight(1f)
                )
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(5f)
            ) {
                Text(
                    text = text,
                    fontSize = 16.sp
                )
            }
            Spacer(Modifier.weight(1f))
        }
    }
}

@Preview
@Composable
fun LoginOptionPreview(modifier: Modifier = Modifier) {
    RandomItTheme {
        LoginOption(
            text = "Google",
            backgroundColor = Color.Red,
            iconRes = R.drawable.google,
            onClick = {}
        )
    }
}