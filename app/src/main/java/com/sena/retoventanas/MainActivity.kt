package com.sena.retoventanas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import com.sena.retoventanas.ui.navigation.AppNavigation
import com.sena.retoventanas.ui.theme.RetoVentanasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RetoVentanasTheme {
                AppNavigation(modifier = Modifier)
            }
        }
    }
}