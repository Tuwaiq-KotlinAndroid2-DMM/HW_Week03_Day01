package com.alidevs.additioncalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}

	fun addButtonPressed(view: View) {
		val intent = Intent(this, ResultActivity::class.java)
		val firstNumber = findViewById<EditText>(R.id.firstNumberEditText).text.toString()
		val secondNumber = findViewById<EditText>(R.id.secondNumberEditText).text.toString()
		val result = Integer.valueOf(firstNumber) + Integer.valueOf(secondNumber)
		intent.putExtra("result", result)

		startActivity(intent)
	}
}