package com.example.randomit.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.randomit.movies.presentation.login.LoginScreen

@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "login_screen",
        modifier = modifier
    ) {
        composable("login_screen") {
            LoginScreen()
        }
    }
}