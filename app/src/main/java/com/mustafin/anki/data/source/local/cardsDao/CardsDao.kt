package com.mustafin.anki.data.source.local.cardsDao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.mustafin.anki.data.source.local.database.CARDS_TABLE_NAME

@Dao
interface CardsDao {
    @Query("SELECT * FROM $CARDS_TABLE_NAME")
    fun getAllCards(): List<CardsEntity>

    @Query("SELECT * FROM $CARDS_TABLE_NAME WHERE deckId = :deckId")
    fun getCardsByDeck(deckId: Int): List<CardsEntity>

    @Insert
    fun addCard(card: CardsEntity)

    @Delete
    fun deleteCard(card: CardsEntity)
}