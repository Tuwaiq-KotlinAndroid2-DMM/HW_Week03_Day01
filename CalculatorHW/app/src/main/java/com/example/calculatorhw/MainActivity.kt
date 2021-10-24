package com.example.calculatorhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var addBtn = findViewById<Button>(R.id.buttonAdd)

        addBtn.setOnClickListener {
            //get content
            var firstNumber = findViewById<EditText>(R.id.editTextFirstNumber).text.toString()
            var secondNumber = findViewById<EditText>(R.id.editTextSecondNumber).text.toString()
            //add both first and second numbers
            var result = firstNumber.toInt() + secondNumber.toInt()
            //create intent and add addition result
            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("result", result)
            startActivity(intent)
            //clear content
            findViewById<EditText>(R.id.editTextFirstNumber).text.clear()
            findViewById<EditText>(R.id.editTextSecondNumber).text.clear()
        }
    }
}