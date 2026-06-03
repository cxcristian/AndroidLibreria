package com.sena.retoventanas.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sena.retoventanas.ui.sections.MisReservaSection.MisReservaSection

@Composable
fun MisReservasScreen(
    navController: NavController,
    nombre: String,
    intImage: Int,
    autor: String,
    descripcion: String,
    categoria: String,
    fecha: String
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            MisReservaSection(navController, nombre, intImage, autor, descripcion, categoria, fecha)
        }
    }
}