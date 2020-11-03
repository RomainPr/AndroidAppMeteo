package com.example.mameteo

import android.app.Application

class App: Application() {

    companion object {
        lateinit var instance: App
        val database: Database by lazy {
            Database(instance)
        }
    }

    override fun onCreate() {
        instance = this
        super.onCreate()
    }

}