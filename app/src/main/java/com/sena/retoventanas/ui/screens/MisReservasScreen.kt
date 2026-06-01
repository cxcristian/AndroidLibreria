package com.sena.retoventanas.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sena.retoventanas.ui.sections.ListBookSection.ListBook
import com.sena.retoventanas.ui.sections.MisReservaSection.MisReservaSection

@Composable
fun MisReservasScreen(navController: NavController ){
    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Column (modifier = Modifier.padding(paddingValues)){ MisReservaSection(navController) }
    }
}