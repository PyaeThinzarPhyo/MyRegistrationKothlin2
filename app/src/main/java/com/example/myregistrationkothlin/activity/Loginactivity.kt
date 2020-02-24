package com.example.myregistrationkothlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myregistrationkothlin.R

class Loginactivity  : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
    }


}