package com.example.hw_week3_day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        var editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        var buttonAdd = findViewById<Button>(R.id.buttonAdd)

        buttonAdd.setOnClickListener {

            var num1 = editTextNumber.text.toString().toDouble()
            var num2 = editTextNumber2.text.toString().toDouble()

            var result = num1.plus(num2)

            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("result",result)
            startActivity(intent)
        }


    }
}