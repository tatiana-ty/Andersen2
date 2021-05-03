package com.andersenlab.andersen2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val arguments = intent.extras

        val textResult = findViewById<TextView>(R.id.text_result)
        textResult.text = arguments?.get("res").toString()
    }
}