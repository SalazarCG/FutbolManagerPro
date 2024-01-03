package com.proyecto.futbolmanagerpro.Routs

sealed class Routs (val route:String){
    object Login: Routs("login")
    object Perfil: Routs("perfil")
    object Equipo: Routs("equipo")
    object Partido: Routs("partido")
    object Estrategia: Routs("estrategia")
}