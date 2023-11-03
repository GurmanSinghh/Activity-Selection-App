package com.example.gurman_comp304_001_hands_on_test1_f23zip

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<View>(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, ExerciseSelectionActivity::class.java)
            startActivity(intent)
        }
    }
}
