package com.example.homewoorkw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class hw3Part1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw3_part1)

        var editTextFN = findViewById<EditText>(R.id.editTextFirstNo)
        var editTextSN = findViewById<EditText>(R.id.editTextSecondNo)
        var buttonadd = findViewById<Button>(R.id.ButtonAdd)

        buttonadd.setOnClickListener {
            var num1 = editTextFN.text.toString()
            var num2 = editTextSN.text.toString()
            var result = num1+num2

            var intent = Intent(this,secondactivit::class.java)
            intent.putExtra("reuslt: ",result)
            startActivity(intent)
        }


    }
}