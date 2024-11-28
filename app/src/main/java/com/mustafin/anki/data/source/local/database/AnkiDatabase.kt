package com.mustafin.anki.data.source.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mustafin.anki.data.source.local.cardsDao.CardsDao
import com.mustafin.anki.data.source.local.decksDao.DecksDao

/* Основная база данных */
@Database(entities = [CardsDao::class, DecksDao::class], version = 1)
abstract class AnkiDatabase: RoomDatabase() {
    abstract fun cardsDao(): CardsDao
    abstract fun decksDao(): DecksDao
}
