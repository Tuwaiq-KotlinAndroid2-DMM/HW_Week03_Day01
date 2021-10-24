package com.example.week3_day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstNumEditText= findViewById<EditText>(R.id.editTextFirstNumber)
        var secondNumEditText= findViewById<EditText>(R.id.editTextSecondNumber)
        var AddButtoun = findViewById<Button>(R.id.buttonAdd)

        AddButtoun.setOnClickListener {
            var firstNum= Integer.valueOf(firstNumEditText.text.toString())
            var secondNum= Integer.valueOf(secondNumEditText.text.toString())
            var intent = Intent(this,SumResult::class.java)
            intent.putExtra("sum",firstNum + secondNum)
            startActivity(intent)
        }

    }
}