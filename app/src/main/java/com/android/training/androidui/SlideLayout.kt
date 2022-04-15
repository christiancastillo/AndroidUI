package com.android.training.androidui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager

class SlideLayout : AppCompatActivity() {
    private lateinit var slideAdapter: SliderAdapter
    private lateinit var introActivityViewPager : ViewPager
    private lateinit var botonSaltarPager : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        introActivityViewPager = findViewById(R.id.introActivityViewPager)
        botonSaltarPager = findViewById(R.id.introActivitySaltar)
        slideAdapter = SliderAdapter(this)
        introActivityViewPager.adapter = slideAdapter

        botonSaltarPager.setOnClickListener {
            startActivity(Intent(this,SplashScreenActivity::class.java))
        }
    }
}