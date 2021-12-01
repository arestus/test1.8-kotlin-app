package com.example.firsthelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton = findViewById<TextView>(R.id.clickButton)
        val redText = findViewById<TextView>(R.id.clickCountView3)
        val greenText = findViewById<TextView>(R.id.clickCountView2)
        val blueText = findViewById<TextView>(R.id.clickCountView)

        redText.setOnClickListener {
            clickMeButton.text = "Clicked on red text"
        }
        greenText.setOnClickListener {
            clickMeButton.text = "Clicked on green text"
        }
        blueText.setOnClickListener {
            clickMeButton.text = "Clicked on blue text"
        }
    }
}