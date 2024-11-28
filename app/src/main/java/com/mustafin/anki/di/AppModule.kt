package com.mustafin.anki.di

import androidx.room.Room
import com.mustafin.anki.data.repositories.cardsRepository.CardsRepositoryImpl
import com.mustafin.anki.data.repositories.decksRepository.DecksRepositoryImpl
import com.mustafin.anki.data.source.local.database.AnkiDatabase
import com.mustafin.anki.presentation.screens.homeScreen.HomeScreenViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {
    single { HomeScreenViewModel() }

    single {
        Room.databaseBuilder(
            androidContext(),
            AnkiDatabase::class.java,
            "anki"
        )
    }

    single { CardsRepositoryImpl(get()) }

    single { DecksRepositoryImpl(get()) }
}