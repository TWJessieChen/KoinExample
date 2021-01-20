package com.jessie.chen.koinexample.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jessie.chen.koinexample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        scopeDemoButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ScopeDemoActivity::class.java)
            startActivity(intent)
        }






    }
}