package com.example.secondattemptui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter (var context : Context) : PagerAdapter(){

    private val layoutInflater : LayoutInflater

    init {
        layoutInflater = LayoutInflater.from(context)
    }

    var slideBackground : IntArray = intArrayOf(R.drawable.gradient_intro_one, R.drawable.gradient_intro_two, R.drawable.gradient)
    var slideImages = intArrayOf(R.drawable.ic_intro_slide1,R.drawable.ic_intro_slide1,R.drawable.ic_intro_slide1)
    var slideHeaders = arrayOf(R.string.header_slide_one, R.string.header_slide_two ,R.string.header_slide_three)
    var slideDescriptions = arrayOf(R.string.header_description_one, R.string.header_description_two ,R.string.header_description_three)

    override fun getCount(): Int {
        return slideHeaders.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as (RelativeLayout)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInflater.inflate(R.layout.intro_slide_one, container, false)
        val slideRelativeLayout : RelativeLayout
        val imageViewLayout : ImageView
        val textViewHeader : TextView
        val textViewDesc : TextView
        val tvPointOne : TextView
        val tvPointTwo : TextView
        val tvPointThree : TextView

        slideRelativeLayout = view.findViewById(R.id.slide_layout_relative_layout) as RelativeLayout
        imageViewLayout = view.findViewById(R.id.slide_layout_imageview) as ImageView
        textViewHeader = view.findViewById(R.id.slide_layout_textview_header) as TextView
        textViewDesc = view.findViewById(R.id.slide_layout_textview_description) as TextView
        tvPointOne = view.findViewById(R.id.slide_layout_textview_dot_one) as TextView
        tvPointTwo = view.findViewById(R.id.slide_layout_textview_dot_one) as TextView
        tvPointThree = view.findViewById(R.id.slide_layout_textview_dot_one) as TextView

        slideRelativeLayout.setBackgroundResource(slideBackground[position])
        imageViewLayout.setImageResource(slideImages[position])
        textViewHeader.setText(slideHeaders[position])
        textViewDesc.setText(slideDescriptions[position])

        when (position) {
            0 -> {
                tvPointOne.setTextColor(context.resources.getColor(R.color.white))
                tvPointTwo.setTextColor(context.resources.getColor(R.color.textteal_200))
                tvPointThree.setTextColor(context.resources.getColor(R.color.textteal_200))
            }
            1 -> {
                tvPointOne.setTextColor(context.resources.getColor(R.color.textteal_200))
                tvPointTwo.setTextColor(context.resources.getColor(R.color.white))
                tvPointThree.setTextColor(context.resources.getColor(R.color.textteal_200))
            }
            2 -> {
                tvPointOne.setTextColor(context.resources.getColor(R.color.textteal_200))
                tvPointTwo.setTextColor(context.resources.getColor(R.color.textteal_200))
                tvPointThree.setTextColor(context.resources.getColor(R.color.white))
            }
        }
        container.addView(view)
        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }
}