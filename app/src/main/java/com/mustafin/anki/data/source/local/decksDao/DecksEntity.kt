package com.mustafin.anki.data.source.local.decksDao

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mustafin.anki.data.source.local.database.DECKS_TABLE_NAME

/* Таблица для хранения данных о колодах */
@Entity(tableName = DECKS_TABLE_NAME)
data class DecksEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String
)
