package com.mustafin.anki.data.source.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mustafin.anki.data.source.local.cardsDao.CardsDao

@Database(entities = [CardsDao::class], version = 1)
abstract class AnkiDatabase: RoomDatabase() {
    abstract fun cardsDao(): CardsDao
}
