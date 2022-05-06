package io.olxbr.hello.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_1)

        val counterValue: TextView = findViewById(R.id.counter_value)
        val addButton: Button = findViewById(R.id.add_button)
        val subtractButton: Button = findViewById(R.id.subtract_button)

        addButton.setOnClickListener{
            val newValue = Integer.parseInt(counterValue.text.toString()) + 1
            counterValue.text = newValue.toString()
        }

        subtractButton.setOnClickListener{
            val newValue = Integer.parseInt(counterValue.text.toString()) - 1
            counterValue.text = newValue.toString()
        }
    }
}