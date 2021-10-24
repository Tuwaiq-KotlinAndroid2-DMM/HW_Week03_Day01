package com.example.hwweek3day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextFirstNumber = findViewById<EditText>(R.id.editTextFirstNumber)
        var editTextSecondNumber = findViewById<EditText>(R.id.editTextSecondNumber)
        var ButtonAdd = findViewById<Button>(R.id.buttonAdd)

        ButtonAdd.setOnClickListener{
            var num1 = editTextFirstNumber.text.toString()
            var num2 = editTextSecondNumber.text.toString()
            var addition = num1+num2

            var intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("Result ",addition)
            startActivity(intent)
        }


    }
}