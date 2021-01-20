package com.jessie.chen.koinexample.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.jessie.chen.koinexample.R
import com.jessie.chen.koinexample.model.SpeciesCreaturePackage
import kotlinx.android.synthetic.main.activity_naming_demo.*
import org.koin.android.ext.android.get

class NamingDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naming_demo)

        creatureDogButton.setOnClickListener {
            val creaturePackage: SpeciesCreaturePackage = get("Dog.SpeciesCreaturePackage")
            setText(creaturePackage)
            setImage(creaturePackage)
        }

        creatureCatButton.setOnClickListener {
            val creaturePackage: SpeciesCreaturePackage = get("Cat.SpeciesCreaturePackage")
            setText(creaturePackage)
            setImage(creaturePackage)
        }


        creatureGodzillaButton.setOnClickListener {
            val creaturePackage: SpeciesCreaturePackage = get("Godzilla.SpeciesCreaturePackage")
            setText(creaturePackage)
            setImage(creaturePackage)
        }
    }

    fun setText(speciesCreaturePackage: SpeciesCreaturePackage) {
        tv_name.text = "creature name:${speciesCreaturePackage.speciesCreature.name()}"
    }


    fun setImage(speciesCreaturePackage: SpeciesCreaturePackage) {
        Glide.with(this).load(speciesCreaturePackage.speciesCreature.image()).into(iv_image);
    }
}
