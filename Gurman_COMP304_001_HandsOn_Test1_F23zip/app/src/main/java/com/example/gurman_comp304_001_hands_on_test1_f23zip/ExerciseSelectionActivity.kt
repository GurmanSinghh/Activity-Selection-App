package com.example.gurman_comp304_001_hands_on_test1_f23zip

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ExerciseSelectionActivity : AppCompatActivity() {

    private lateinit var nextButton: Button
    private lateinit var lineImageView: ImageView
    private lateinit var looseThingsCheckBox: CheckBox
    private lateinit var rememberNamesCheckBox: CheckBox
    private lateinit var learnQuicklyCheckBox: CheckBox
    private lateinit var trackMultipleThingsCheckBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_selection)

        nextButton = findViewById(R.id.nextButton)
        lineImageView = findViewById(R.id.lineImageView)
        looseThingsCheckBox = findViewById(R.id.looseThingsCheckBox)
        rememberNamesCheckBox = findViewById(R.id.rememberNamesCheckBox)
        learnQuicklyCheckBox = findViewById(R.id.learnQuicklyCheckBox)
        trackMultipleThingsCheckBox = findViewById(R.id.trackMultipleThingsCheckBox)

        nextButton.setOnClickListener {
            val selectedExercises = getSelectedExercises()
            Toast.makeText(this, "Selected Exercises: $selectedExercises", Toast.LENGTH_SHORT).show()
        }

        // Draw the zigzag line on the ImageView
        val yCoordinates = resources.getStringArray(R.array.y_coordinates)
        val points = mutableListOf<Pair<Float, Float>>()
        for (i in yCoordinates.indices) {
            val x = i * 100f
            val y = yCoordinates[i].toFloat()
            points.add(Pair(x, y))
        }
        lineImageView.post { drawZigzagLine(lineImageView, points) }
    }

    private fun getSelectedExercises(): String {
        val exercises = mutableListOf<String>()

        if (looseThingsCheckBox.isChecked) {
            exercises.add("Loose Things")
        }
        if (rememberNamesCheckBox.isChecked) {
            exercises.add("Remember Names")
        }
        if (learnQuicklyCheckBox.isChecked) {
            exercises.add("Learn Quickly")
        }
        if (trackMultipleThingsCheckBox.isChecked) {
            exercises.add("Keep Track of Multiple Things")
        }

        return exercises.joinToString(", ")
    }

    private fun drawZigzagLine(imageView: ImageView, points: List<Pair<Float, Float>>) {
        // Implement the drawing logic here using Canvas and Paint
        // You can use the provided points to draw the zigzag line on the ImageView
    }
}
