package com.android.training.androidui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import com.android.training.androidui.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var splashActivityBinding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE) //Remove title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN) //Remove notification bar
        splashActivityBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        var animation  = AnimationUtils.loadAnimation(this, R.anim.animation)
        setContentView(R.layout.activity_splash_screen)
        splashActivityBinding.splashActivityImageViewLogo.startAnimation(animation)
        splashActivityBinding.slashActivityTv.startAnimation(animation)

        //Acceso a la base de datos
        var handler = Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
        }, 3000)


    }

}