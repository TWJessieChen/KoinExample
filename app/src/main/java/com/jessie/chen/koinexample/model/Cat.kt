package com.jessie.chen.koinexample.model

import android.net.Uri
import com.jessie.chen.koinexample.R
import com.jessie.chen.koinexample.BuildConfig

class Cat : SpeciesCreature {

    override fun image(): String {
        return Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.cat).toString()
    }

    override fun shout(): String {
        return "JC"
    }

    override fun name(): String {
        return "Cat"
    }

}