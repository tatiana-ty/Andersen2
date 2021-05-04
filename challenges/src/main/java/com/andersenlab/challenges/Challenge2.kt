package com.andersenlab.challenges

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Challenge2: AppCompatActivity() {
    private var count = 0
    private lateinit var showCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge2)
        showCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View?) {
        Toast.makeText(
            this, R.string.toast_message,
            Toast.LENGTH_SHORT
        ).show()
    }

    fun countUp(view: View?) {
        count++
        showCount.text = count.toString()
    }

    override fun onSaveInstanceState(saveInstanceState: Bundle) {
        super.onSaveInstanceState(saveInstanceState)
        saveInstanceState.putInt("Counter", count)
    }

    override fun onRestoreInstanceState(saveInstanceState: Bundle) {
        super.onRestoreInstanceState(saveInstanceState)
        count = saveInstanceState.getInt("Counter")
        showCount.text = count.toString()
    }
}