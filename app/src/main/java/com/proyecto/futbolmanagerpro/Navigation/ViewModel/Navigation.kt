package com.proyecto.futbolmanagerpro.Navigation.ViewModel

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.logEvent
import com.proyecto.futbolmanagerpro.Login.View.Login
import com.proyecto.futbolmanagerpro.Navigation.Model.Routs
import com.proyecto.futbolmanagerpro.Navigation.View.Screen
import com.proyecto.futbolmanagerpro.Team.View.Team

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation(analytics: FirebaseAnalytics ,navController: NavHostController = rememberNavController()) {
    Screen{
        NavHost(navController = navController,
            startDestination = Routs.Login.route
        ){
            composable(Routs.Login.route){
                Login(
                    analytics = analytics,
                    navigateToTeam = {
                        navController.navigate(Routs.Team.route)
                    }
                )

            }
            composable(Routs.Team.route){
                Team(analytics = analytics)
            }
        }

    }
}

@Composable
fun trakScreen(name: String, analytics: FirebaseAnalytics){
    DisposableEffect(Unit){
        onDispose {
            analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW){
                param(FirebaseAnalytics.Param.SCREEN_NAME, name)
            }
        }
    }
}
