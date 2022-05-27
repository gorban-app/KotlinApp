package ru.xpcom.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var textView: TextView

    var questionNo = 0
    var questions = listOf(
        "Какие два официальных языка используются для разработки Android? \n\n A) Kotlin и Java \n\n B) Java и Python \n\n C) Kotlin и Python",
        "Как вы определяете функцию в Kotlin? \n\n A) void \n\n B) var \n\n C) function",
        "Для чего используется переменная? \n\n A) Чтобы содержать данные \n\n B) Чтобы вставить случайное значение \n\n C) Не знаю",
        "Что означает SDK в Android SDK? \n\n A) Software Development Kit \n\n B) Software Development Kotlin \n\n C) Something Don't Know"
    )
    var rightAnswers = listOf(1, 2, 1, 1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        textView = findViewById(R.id.textView)

        button.setOnClickListener {
            showToast(1)
        }

        button2.setOnClickListener {
            showToast(2)
        }

        button3.setOnClickListener {
            showToast(3)
        }

    }

    fun showToast(answer: Int) {
        if (answer == rightAnswers.get(questionNo)) {
            Toast.makeText(applicationContext, "ПРАВИЛЬНО!", Toast.LENGTH_SHORT).show()
            updateQuestion()
        } else {
            Toast.makeText(applicationContext, "НЕ ПРАВИЛЬНО!", Toast.LENGTH_SHORT).show()
        }
    }

    fun updateQuestion() {
        questionNo += 1
        textView.setText(questions.get(questionNo))
    }
}