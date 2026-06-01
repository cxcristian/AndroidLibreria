package com.sena.retoventanas.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sena.retoventanas.ui.sections.DetalleReserva.DetalleReservaSection

@Composable
fun DetalleReservaScreen(navController: NavController, nombre: String, autor: String, Nimage: Int, fecha: String) {
    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            DetalleReservaSection(navController, nombre, autor, Nimage, fecha)
        }
    }
}
