package com.android.training.androidui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter(var context: Context): PagerAdapter() {

    private var layoutInflater  : LayoutInflater
    init{
        layoutInflater = LayoutInflater.from(context)
    }

    var slideBackground : IntArray = intArrayOf(R.drawable.gradiente, R.drawable.gradiente, R.drawable.gradiente, R.layout.activity_splash_screen)
    var slideImages : IntArray = intArrayOf(R.drawable.ic_baseball_ball_intro, R.drawable.ic_baseball_intro_two)
    var slideHeader  : IntArray = intArrayOf(R.string.intro_bienvenido, R.string.intro_bienvenido, R.string.intro_disfrutar, R.string.intro_disfrutar)
    var slideHeaderDesc  : IntArray = intArrayOf(R.string.intro_bienvenido_desc, R.string.intro_bienvenido_desc, R.string.intro_disfrutar_desc, R.string.intro_disfrutar_desc)

    //Se pueden crear distintos gradientes/XMLs para visalizar

    override fun getCount(): Int {
        TODO("Not yet implemented")
        return slideHeader.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        TODO("Not yet implemented")
        return view === `object` as (RelativeLayout)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInflater.inflate(R.layout.slide_layout_)
    }
}