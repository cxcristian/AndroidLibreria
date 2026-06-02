package com.sena.retoventanas.ui.viewModel.contador

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContadorView: ViewModel(){
    private val _contador = MutableStateFlow(0)
    val contador = _contador.asStateFlow()

    fun incrementar(){
        _contador.value++
    }
    fun resetear(){
        _contador.value = 0
    }
    fun restar(){
        _contador.value -= 1
    }
    fun potencia(){
        _contador.value *= _contador.value
    }
}