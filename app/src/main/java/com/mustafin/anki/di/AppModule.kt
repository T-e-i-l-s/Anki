package com.mustafin.anki.di

import com.mustafin.anki.presentation.screens.homeScreen.HomeScreenViewModel
import org.koin.dsl.module

val appModule = module {
    single { HomeScreenViewModel() }
}