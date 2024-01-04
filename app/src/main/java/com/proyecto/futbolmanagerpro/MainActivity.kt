package com.proyecto.futbolmanagerpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.proyecto.futbolmanagerpro.Navigation.ViewModel.Navigation
import com.proyecto.futbolmanagerpro.ui.theme.FutbolManagerProTheme

class MainActivity : ComponentActivity() {
    private lateinit var analytics: FirebaseAnalytics
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        analytics = Firebase.analytics
        setContent {
            FutbolManagerProTheme{
                Navigation(analytics)
            }
        }
    }
}

