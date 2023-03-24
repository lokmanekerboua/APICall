package com.example.api1.domain.item

import com.example.api1.data.remote.model.GamesItem

data class GameItem(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String,

    )

fun GamesItem.toGameItem()= GameItem(id, title, thumbnail, short_description)