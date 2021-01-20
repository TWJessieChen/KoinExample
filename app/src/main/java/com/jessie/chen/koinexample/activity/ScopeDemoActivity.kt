package com.jessie.chen.koinexample.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jessie.chen.koinexample.R
import com.jessie.chen.koinexample.fragment.ScopeDemoFragmentA
import com.jessie.chen.koinexample.fragment.ScopeDemoFragmentB
import kotlinx.android.synthetic.main.activity_scope_demo.*
import org.koin.android.scope.ext.android.bindScope
import org.koin.android.scope.ext.android.createScope

class ScopeDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope_demo)

        bindScope(createScope("DogSession"))

        fragmentButtonA.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, ScopeDemoFragmentA()).commit()
        }

        fragmentButtonB.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, ScopeDemoFragmentB()).commit()
        }


    }

}