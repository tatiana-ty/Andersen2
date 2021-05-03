package com.andersenlab.andersen2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counter: TextView
    private var crowNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counter = findViewById(R.id.counter)
        val plus = findViewById<Button>(R.id.plus)
        plus.setOnClickListener {
            crowNumber++
            counter.text = crowNumber.toString()
        }
        val minus = findViewById<Button>(R.id.minus)
        minus.setOnClickListener {
            if (crowNumber > 0) {
                crowNumber--
                counter.text = crowNumber.toString()
            }
        }
        val result = findViewById<Button>(R.id.result)
        result.setOnClickListener {
            val intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putExtra("res", crowNumber)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(saveInstanceState: Bundle) {
        super.onSaveInstanceState(saveInstanceState)
        saveInstanceState.putInt("Counter", crowNumber)
    }

    override fun onRestoreInstanceState(saveInstanceState: Bundle) {
        super.onRestoreInstanceState(saveInstanceState)
        crowNumber = saveInstanceState.getInt("Counter")
        counter.text = crowNumber.toString()
    }
}