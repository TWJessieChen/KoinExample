package com.jessie.chen.koinexample.model

interface SpeciesCreature {

    companion object {
        const val TYPE_DOG = 0
        const val TYPE_CAT = 1
        const val TYPE_GODZILLA = 2
    }

    fun image(): String
    fun shout(): String
    fun name():String

}