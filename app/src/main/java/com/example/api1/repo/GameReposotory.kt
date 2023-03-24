package com.example.api1.repo

import com.example.api1.data.remote.GamesService
import com.example.api1.domain.item.GameItem
import com.example.api1.domain.item.toGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GamesService) {
    suspend fun getGames():List<GameItem>{
        return gameService.getGames().map {
            it.toGameItem()
        }
    }
}