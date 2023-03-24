package com.example.api1.data.remote

import com.example.api1.data.remote.model.GamesItem
import com.example.api1.util.Constants.Companion.GAMES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET


interface GamesApi {

    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GamesItem>>
}