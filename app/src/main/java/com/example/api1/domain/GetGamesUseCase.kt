package com.example.api1.domain

import com.example.api1.domain.item.GameItem
import com.example.api1.repo.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepositoty: GameRepository){
    suspend operator fun invoke():List<GameItem>{
        return gameRepositoty.getGames().shuffled()
    }
}