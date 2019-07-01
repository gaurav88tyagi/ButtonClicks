package com.example.buttonclicks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val TAG = "BTN"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn2.setOnClickListener {
            Log.d(TAG, "Second Button Clicked")
        }

        btn3.setOnClickListener(this)

    }

    fun onButtonClicked (v: View) {
        Log.d(TAG, "Button Clicked")
    }

    override fun onClick(p0: View?) {
        Log.d(TAG, "3rd Button Clicked")
    }

}
