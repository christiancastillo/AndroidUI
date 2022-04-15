package com.android.training.androidui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
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
        return slideHeader.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as (RelativeLayout)
    }



    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInflater.inflate(R.layout.slide_layout_,container, false)
        view.findViewById<RelativeLayout>(R.id.slideLayoutRelative).setBackgroundResource(slideBackground[position])
        view.findViewById<ImageView>(R.id.slideLayoutImageView).setImageResource(slideImages[position])
        view.findViewById<TextView>(R.id.slideLayoutv1).setText(slideHeader[position])
        view.findViewById<TextView>(R.id.slideLayoutv2).setText(slideHeaderDesc[position])
        when (position){
            0 -> {
                view.findViewById<TextView>(R.id.slideLayoutPointOne).setTextColor(context.resources.getColor(R.color.primaryLightColor))
                view.findViewById<TextView>(R.id.slideLayoutPointTwo).setTextColor(context.resources.getColor(R.color.cardview_dark_background))
                view.findViewById<TextView>(R.id.slideLayoutPointThree).setTextColor(context.resources.getColor(R.color.cardview_dark_background))
            }
            1 -> {
                view.findViewById<TextView>(R.id.slideLayoutPointOne).setTextColor(context.resources.getColor(R.color.cardview_dark_background))
                view.findViewById<TextView>(R.id.slideLayoutPointTwo).setTextColor(context.resources.getColor(R.color.primaryLightColor))
                view.findViewById<TextView>(R.id.slideLayoutPointThree).setTextColor(context.resources.getColor(R.color.cardview_dark_background))
            }
            2 -> {
                view.findViewById<TextView>(R.id.slideLayoutPointOne).setTextColor(context.resources.getColor(R.color.cardview_dark_background))
                view.findViewById<TextView>(R.id.slideLayoutPointTwo).setTextColor(context.resources.getColor(R.color.cardview_dark_background))
                view.findViewById<TextView>(R.id.slideLayoutPointThree).setTextColor(context.resources.getColor(R.color.primaryLightColor))
            }
        }

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }
}