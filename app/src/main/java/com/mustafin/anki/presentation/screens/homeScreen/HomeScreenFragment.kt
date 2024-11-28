package com.mustafin.anki.presentation.screens.homeScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mustafin.anki.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeScreenFragment: Fragment() {
    private val viewModel: HomeScreenViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.home_screen, container, false)

        return root
    }
}