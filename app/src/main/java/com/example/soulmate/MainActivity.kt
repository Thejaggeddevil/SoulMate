package com.example.soulmate



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.soulmate.navigation.SoulMateNavGraph
import com.example.soulmate.ui.theme.SoulMateTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SoulMateTheme {
                SoulMateNavGraph()
            }
        }
    }
}