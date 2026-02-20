package com.example.soulmate.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.soulmate.model.User
import com.example.soulmate.ui.components.BottomNavBar
import com.example.soulmate.ui.components.SwipeCard

import com.example.soulmate.ui.components.*

@Composable
fun HomeScreen(navController: NavController) {

    val sampleUser = User(
        id = "1",
        name = "Aarohi",
        age = 23,
        imageUrl = "https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e"
    )

    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) { padding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center
        ) {

            SwipeCard(
                user = sampleUser,
                onSwipeRight = {
                    navController.navigate("match/85")
                },
                onSwipeLeft = {}
            )
        }
    }
}