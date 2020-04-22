package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setlisteners()
    }

    private fun setlisteners() {
        val clickableviews : List<View> =
            listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text)
        for (item in clickableviews) {
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(it: View?) {
        when (View.id) {
//            boxes using color class color for background
            R.id.box_one_text -> it?.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> it?.setBackgroundColor(Color.GRAY)

//            boxes using color class from android color resources
            R.id.box_three_text -> it?.setBackgroundResource((android.R.color.holo_green_light))
        }

    }
}
