package io.olxbr.hello.android

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.NumberFormatException

class FirstExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_1)

        // Get view references
        val firstGradeInput: EditText = findViewById(R.id.first_grade_input)
        val secondGradeInput: EditText = findViewById(R.id.second_grade_input)
        val numberOfAbsencesInput: EditText = findViewById(R.id.number_of_absences_input)
        val calculateButton: Button = findViewById(R.id.calculate_button)
        val resultsText: TextView = findViewById(R.id.result_text)

        // Listen to events and manipulate views
        calculateButton.setOnClickListener {
            try {
                val firstGrade = Integer.parseInt(firstGradeInput.text.toString())
                val secondGrade = Integer.parseInt(secondGradeInput.text.toString())
                val numberOfAbsences = Integer.parseInt(numberOfAbsencesInput.text.toString())
                val averageGrade: Float = (firstGrade + secondGrade) / 2.0f

                if (averageGrade >= 6.0f && numberOfAbsences <= 5) {
                    resultsText.text =
                        "Aprovado com média $averageGrade e $numberOfAbsences faltas."
                } else {
                    resultsText.text =
                        "Reprovado com média $averageGrade e $numberOfAbsences faltas."
                }
            } catch (ex: NumberFormatException) {
                resultsText.text = "A primeira nota deve ser um valor válido."
            }

            resultsText.visibility = View.VISIBLE
        }
    }
}