package com.example.seekbarcolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var red = 255
        var green = 255
        var blue = 255

        tv_red.setText("Red = $red")
        tv_green.setText("Green = $green")
        tv_blue.setText("Blue = $blue")

        background.setBackgroundColor(Color.rgb(red,green,blue))

        sb_red.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(sb: SeekBar?, progress: Int, fromUser: Boolean) {
                red = progress
                tv_red.setText("Red = $red")
                background.setBackgroundColor(Color.rgb(red,green,blue))
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }


        })

        sb_green.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(sb: SeekBar?, progress: Int, fromUser: Boolean) {

                green = progress
                tv_green.setText("Green = $green")
                background.setBackgroundColor(Color.rgb(red,green,blue))

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }


        })

        sb_blue.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(sb: SeekBar?, progress: Int, fromUser: Boolean) {

                blue = progress
                tv_blue.setText("Blue = $blue")

                background.setBackgroundColor(Color.rgb(red,green,blue))

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }


        })
    }
}