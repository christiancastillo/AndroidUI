package com.example.secondattemptui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager

class IntroActivity : AppCompatActivity() {

    private lateinit var sliderAdapter: SliderAdapter
    private lateinit var nextButton : Button
    private lateinit var viewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        sliderAdapter = SliderAdapter(this)
        nextButton = findViewById(R.id.intro_activity_next)
        viewPager = findViewById(R.id.intro_activity_pager)
        viewPager.setAdapter(sliderAdapter)
        nextButton.setOnClickListener{
            startActivity(Intent(this@IntroActivity, MainActivity::class.java))
        }

    }
}