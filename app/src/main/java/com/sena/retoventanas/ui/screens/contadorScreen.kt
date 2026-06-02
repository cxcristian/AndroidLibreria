package com.sena.retoventanas.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sena.retoventanas.ui.viewModel.contador.ContadorView

@Composable
fun ContadorScreen(vieModel: ContadorView = viewModel()){
    val contador by vieModel.contador.collectAsStateWithLifecycle()
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("$contador")

        Button(onClick = { vieModel.incrementar() }) { Text("incrementar") }
        Button(onClick = { vieModel.restar() }) { Text("restar") }
        Button(onClick = { vieModel.potencia() }) { Text("potencia") }
        Button(onClick = { vieModel.resetear() }) { Text("resetear") }
    }

}