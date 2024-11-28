package com.mustafin.anki.data.source.local.decksDao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.mustafin.anki.data.source.local.database.DECKS_TABLE_NAME

@Dao
interface DecksDao {
    @Query("SELECT * FROM $DECKS_TABLE_NAME")
    fun getAllDecks(): List<DecksEntity>

    @Insert
    fun addDeck(deck: DecksEntity)

    @Delete
    fun deleteDeck(deck: DecksEntity)
}