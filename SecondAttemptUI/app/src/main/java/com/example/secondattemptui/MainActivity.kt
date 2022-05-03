package com.example.secondattemptui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.postDelayed

class MainActivity : AppCompatActivity() {
    private lateinit var imageviewLogo : ImageView
    lateinit var textviewLogo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageviewLogo = findViewById(R.id.splash_activity_imageview_logo) as ImageView
        textviewLogo = findViewById(R.id.splash_activity_textview_message) as TextView
        
        var animation = AnimationUtils.loadAnimation(this, R.anim.animation)
        imageviewLogo.startAnimation(animation)

        var handler = Handler().postDelayed({
            startActivity(Intent(this, IntroActivity::class.java))
        }, 3000)

    }
}