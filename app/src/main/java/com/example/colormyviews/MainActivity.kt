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
//        create a variable wich is a List of type <View> which equals a list of views in the layout
        val clickableviews : List<View> =
            listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout, red_button, green_button, yellow_button)
        for (item in clickableviews) {
//            since they are doing the same thing we set a setOnClickListener to the all the items.
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
//            boxes using color class color for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

//            boxes using color class from android color resources
            R.id.box_three_text -> view.setBackgroundResource((android.R.color.holo_green_light))
            R.id.box_four_text -> view.setBackgroundResource((android.R.color.holo_red_dark))
            R.id.box_five_text -> view.setBackgroundResource((android.R.color.holo_blue_light))

            R.id.red_button -> box_three_text.setBackgroundResource((R.color.my_red))
            R.id.green_button -> box_four_text.setBackgroundResource((R.color.my_green))
            R.id.yellow_button -> box_five_text.setBackgroundResource((R.color.my_yellow))

            else -> view.setBackgroundColor(Color.GRAY)
        }

    }
}
