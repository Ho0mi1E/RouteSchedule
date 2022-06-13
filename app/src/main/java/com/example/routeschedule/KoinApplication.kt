package com.example.routeschedule

import android.app.Application
import com.example.routeschedule.presentation.di.viewModelModule
import org.koin.core.context.startKoin

class KoinApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin { modules(viewModelModule) }
    }
}