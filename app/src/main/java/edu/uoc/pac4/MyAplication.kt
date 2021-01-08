package edu.uoc.pac4

import android.app.Application
import edu.uoc.pac4.data.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyAplication  : Application(){
    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin{
            androidLogger()
            androidContext(applicationContext)
            modules(dataModule)
        }
    }
}