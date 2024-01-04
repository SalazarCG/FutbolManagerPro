package com.proyecto.futbolmanagerpro.Navigation.Model

sealed class Routs (val route:String){
    object Login: Routs("login")
    object Profile: Routs("profile")
    object Team: Routs("team")
    object Game: Routs("game")
    object Strategy: Routs("strategy")
}