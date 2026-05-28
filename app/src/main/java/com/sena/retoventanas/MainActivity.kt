package com.sena.retoventanas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sena.retoventanas.ui.screens.HomeScreen
import com.sena.retoventanas.ui.theme.RetoVentanasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeScreen()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    RetoVentanasTheme {
        HomeScreen()
    }
}