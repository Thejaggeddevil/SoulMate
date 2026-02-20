package com.example.soulmate.ui.screen



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MatchResultScreen(score: Int, navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("AI Compatibility", style = MaterialTheme.typography.titleLarge)

        Spacer(Modifier.height(24.dp))

        Text(
            "$score %",
            style = MaterialTheme.typography.displayLarge
        )

        Spacer(Modifier.height(32.dp))

        Button(onClick = {
            navController.navigate("home")
        }) {
            Text("Continue Swiping")
        }
    }
}