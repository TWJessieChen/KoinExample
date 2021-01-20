package com.jessie.chen.koinexample

import android.app.Application
import com.jessie.chen.koinexample.model.speciesCreatureModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin(this,listOf(speciesCreatureModule))

    }


}