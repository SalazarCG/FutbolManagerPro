package com.proyecto.futbolmanagerpro.Navigation.View

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.proyecto.futbolmanagerpro.ui.theme.FutbolManagerProTheme

@Composable
fun Screen(content: @Composable () -> Unit){
    FutbolManagerProTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}