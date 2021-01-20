package com.jessie.chen.koinexample.model

import org.koin.core.scope.Scope
import org.koin.dsl.module.module

val speciesCreatureModule = module {


    scope("DogSession") {
        Dog()
    }

    single {
        Cat()
        Dog()
        Godzilla()
    }


    module("Dog") {
        factory { SpeciesCreaturePackage(get()) }
        single { Dog() as SpeciesCreature }

    }

    module("Cat") {
        factory { SpeciesCreaturePackage(get()) }
        single { Cat() as SpeciesCreature }

    }

    module("Godzilla") {
        factory { SpeciesCreaturePackage(get()) }
        single { Godzilla() as SpeciesCreature }

    }


}