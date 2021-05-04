package com.andersenlab.challenges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Challenge1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge1)
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = getText(R.string.happy_birthday)
        Log.e("Challenges", "Happy Birthday")
    }
}