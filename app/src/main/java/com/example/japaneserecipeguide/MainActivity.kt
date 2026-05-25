package com.example.japaneserecipeguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.japaneserecipeguide.navigation.AppNavigation
import com.example.japaneserecipeguide.ui.theme.JapaneseRecipeGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JapaneseRecipeGuideTheme {
                AppNavigation()
            }
        }
    }
}