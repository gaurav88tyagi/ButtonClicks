package com.example.buttonclicks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "BTN"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            Log.d(TAG, "Second Button Clicked")
        }

    }

    fun onButtonClicked (v: View)
    {
        Log.d(TAG, "Button Clicked")
    }

}
