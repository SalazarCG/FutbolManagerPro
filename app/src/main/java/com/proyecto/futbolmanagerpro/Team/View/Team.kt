package com.proyecto.futbolmanagerpro.Team.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.google.firebase.analytics.FirebaseAnalytics
import com.proyecto.futbolmanagerpro.Navigation.ViewModel.trakScreen

@Composable
fun Team(analytics: FirebaseAnalytics) {
    trakScreen(name = "Ingreso a Team", analytics = analytics)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Equipo", fontSize = 40.sp)
    }

}