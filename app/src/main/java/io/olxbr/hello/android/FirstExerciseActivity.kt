package io.olxbr.hello.android

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstExerciseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_1)

        // Get view references
        val counterText: TextView = findViewById(R.id.counter_value)
        val addButton: Button = findViewById(R.id.add_button)
        val subtractButton: Button = findViewById(R.id.subtract_button)

        // Listen to events and manipulate views
        addButton.setOnClickListener {
            val counterValue = Integer.parseInt(counterText.text.toString())
            counterText.text = (counterValue + 1).toString()
        }

        subtractButton.setOnClickListener {
            val counterValue = Integer.parseInt(counterText.text.toString())
            counterText.text = (counterValue - 1).toString()
        }
    }
}
