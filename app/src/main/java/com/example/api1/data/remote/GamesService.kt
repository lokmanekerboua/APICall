package com.example.api1.data.remote

import com.example.api1.data.remote.model.GamesItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class GamesService @Inject constructor(private val gameapi: GamesApi){

    suspend fun  getGames():List<GamesItem>{
        return withContext(Dispatchers.IO){
            val games = gameapi.getGames()
            games.body()?: emptyList()
        }
    }

}