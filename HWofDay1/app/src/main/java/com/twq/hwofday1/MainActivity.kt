package com.twq.hwofday1

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
        var buttonAdd = findViewById<Button>(R.id.buttonAdd)

        buttonAdd.setOnClickListener {
            var result = editTextFirstNumber.text.toString().toInt() + editTextSecondNumber.text.toString().toInt()

            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("result",result)

                startActivity(intent)
            }
        }
    }