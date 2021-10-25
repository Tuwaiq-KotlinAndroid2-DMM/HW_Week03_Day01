package com.example.hw10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //objects
        var editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)
        var editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        var btnAdd = findViewById<Button>(R.id.btnAdd)

        //Events
        btnAdd.setOnClickListener {
            var num1 = editTextNumber1.text.toString().toInt()
            var num2 = editTextNumber2.text.toString().toInt()
            var result = num1 +num2
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("result",result)
            startActivity(intent)


        }

    }
}