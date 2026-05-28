package com.sena.retoventanas.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sena.retoventanas.ui.sections.HomeSection.PresentationSection
import com.sena.retoventanas.ui.theme.RetoVentanasTheme


@Composable
fun HomeScreen(){
    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Column (modifier = Modifier.padding(paddingValues)){ PresentationSection() }

    }
}
