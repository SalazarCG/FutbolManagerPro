package com.proyecto.futbolmanagerpro.Utils

import android.content.Context
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.proyecto.futbolmanagerpro.Team.model.Players
import java.util.concurrent.Flow

//Clase dependencia a RealTime Database
class RealTimeManager(context: Context) {
    //Referencia a la base de datos
    private val databaseReference: DatabaseReference = FirebaseDatabase.getInstance().reference.child("players")


    //Función para agregar un nuevo jugador en referencia a su key
    fun addPlayer(players: Players){
        val key = databaseReference.push().key
        if (key != null){
            databaseReference.child(key).setValue(players)
        }
    }

    //Función para eliminar jugador
    fun deletePlayer(jugadorId: String){
        databaseReference.child(jugadorId).removeValue()
    }

    fun updatePlayer(playerId: String, updatedPlayer: Players){
        databaseReference.child(playerId).setValue(updatedPlayer)
    }

    //Obtención de datos asíncronas


}