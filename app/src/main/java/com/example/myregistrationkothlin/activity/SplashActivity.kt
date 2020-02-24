package com.example.myregistrationkothlin.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myregistrationkothlin.MainActivity
import com.example.myregistrationkothlin.R

class SplashActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash);

        supportActionBar?.hide()

        val sharedPreferences = getSharedPreferences("userID", Context.MODE_PRIVATE)
        val splashImage=findViewById<ImageView>(R.id.splah_image)

        Handler().postDelayed({

            if (sharedPreferences.contains("userID") && sharedPreferences.contains("userID")!=null){
                val intent=Intent(this,MainActivity ::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                val intent=Intent(this,Loginactivity::class.java)
                startActivity(intent)
                finish()
            }

        },3000)

        val animation=AnimationUtils.loadAnimation(this,R.anim.splash_ani)
        splashImage.startAnimation(animation)

    }
}