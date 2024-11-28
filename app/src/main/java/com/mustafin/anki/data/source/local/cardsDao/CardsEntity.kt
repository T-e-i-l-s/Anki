package com.mustafin.anki.data.source.local.cardsDao

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mustafin.anki.data.source.local.database.CARDS_TABLE_NAME

@Entity(tableName = CARDS_TABLE_NAME)
data class CardsEntity(
    @PrimaryKey val id: Int,
    val side1: String,
    val side2: String,
    val deckId: Int
)