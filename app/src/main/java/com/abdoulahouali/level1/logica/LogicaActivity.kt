package com.abdoulahouali.level1.logica

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_logica.*


class LogicaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica)

        submitBtn.setOnClickListener {
            val correct: Int = checkAnswers()
            val toastText = getString(R.string.correctAnswers, correct)

            Toast.makeText(this, toastText, Toast.LENGTH_LONG).show()
        }
    }

    private fun checkAnswers(): Int {
        var correctAnswers = 0

        when (answer1_et.text.toString()) {
            (getString(R.string.t)) -> correctAnswers = correctAnswers.inc()
        }
        when (answer2_et.text.toString()) {
            (getString(R.string.f)) -> correctAnswers = correctAnswers.inc()
        }
        when (answer3_et.text.toString()) {
            (getString(R.string.f)) -> correctAnswers = correctAnswers.inc()
        }
        when (answer4_et.text.toString()) {
            (getString(R.string.f)) -> correctAnswers = correctAnswers.inc()
        }

        return correctAnswers
    }

}
