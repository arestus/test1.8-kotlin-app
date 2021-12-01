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
            clickMeButton.text = "Red was clicked"
        }
        greenText.setOnClickListener {
            clickMeButton.text = "Green was clicked"
        }
        blueText.setOnClickListener {
            clickMeButton.text = "Blue was clicked"
        }
    }
}