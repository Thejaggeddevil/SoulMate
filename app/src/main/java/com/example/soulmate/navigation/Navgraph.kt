package com.example.soulmate.navigation



import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.soulmate.ui.screen.AuthScreen
import com.example.soulmate.ui.screen.HomeScreen
import com.example.soulmate.ui.screen.ProfileCreationScreen


@Composable
fun SoulMateNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "auth"
    ) {

        composable("auth") {
            AuthScreen(navController)
        }

        composable("profile_setup") {
            ProfileCreationScreen(navController)
        }

        composable("home") {
            HomeScreen(navController)
        }
    }
}