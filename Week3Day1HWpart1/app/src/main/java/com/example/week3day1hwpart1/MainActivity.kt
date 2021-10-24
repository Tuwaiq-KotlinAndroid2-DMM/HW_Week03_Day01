package com.example.week3day1hwpart1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextTextNum1 = findViewById<EditText>(R.id.editTextTextNumber1)
        var editTextTextNum2 = findViewById<EditText>(R.id.editTextTextNumber2)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            var num1 = editTextTextNum1.text.toString()
            var num2 = editTextTextNum2.text.toString()
            var result = num1.toInt() + num2.toInt()

            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("result", result)
            startActivity(intent)

        }
    }
}