package com.sena.retoventanas.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sena.retoventanas.ui.sections.ListBookSection.ListBook

@Composable
fun ListBookScreen(navController: NavController ){
    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Column (modifier = Modifier.padding(paddingValues)){ ListBook(navController) }
    }
}
