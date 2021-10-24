package com.alidevs.additioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_result)

		val resultTextView = findViewById<TextView>(R.id.resultTextView)
		resultTextView.text = intent.getIntExtra("result", -1).toString()
	}
}