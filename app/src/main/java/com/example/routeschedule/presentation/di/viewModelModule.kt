package com.example.routeschedule.presentation.di

import com.example.routeschedule.presentation.SharedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel() { SharedViewModel() }
}