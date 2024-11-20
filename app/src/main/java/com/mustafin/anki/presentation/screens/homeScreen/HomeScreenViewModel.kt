package com.mustafin.anki.presentation.screens.homeScreen

import androidx.lifecycle.ViewModel
import com.mustafin.anki.data.repository.TestRepository

class HomeScreenViewModel(private val testRepository: TestRepository) : ViewModel() {
    init {
        println("ViewModel init")
    }

    fun hello() {
        testRepository.sayHello()
    }
}