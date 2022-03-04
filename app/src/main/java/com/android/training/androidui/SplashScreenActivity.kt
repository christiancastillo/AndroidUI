package com.android.training.androidui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.android.training.androidui.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var splashActivityBinding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashActivityBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        var animation  = AnimationUtils.loadAnimation(this, R.anim.animation)
        setContentView(R.layout.activity_splash_screen)
        splashActivityBinding.splashActivityImageViewLogo.startAnimation(animation)
        splashActivityBinding.slashActivityTv.startAnimation(animation)

        var handler = Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
        }, 3000)


    }

}