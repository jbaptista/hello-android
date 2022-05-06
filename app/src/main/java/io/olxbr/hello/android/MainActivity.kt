package io.olxbr.hello.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToFirstExampleButton: Button = findViewById(R.id.example_1)
        val goToFirstExerciseButton: Button = findViewById(R.id.hands_on_1)

        goToFirstExampleButton.setOnClickListener {
            startActivity(Intent(this, FirstExampleActivity::class.java))
        }

        goToFirstExerciseButton.setOnClickListener {
            startActivity(Intent(this, CounterActivity::class.java))
        }
    }
}
