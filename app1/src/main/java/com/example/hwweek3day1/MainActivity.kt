package com.example.hwweek3day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var firstNum = findViewById<EditText>(R.id.editTextNumber1)
        var secondNum = findViewById<EditText>(R.id.editTextNumber2)
        var addButton = findViewById<Button>(R.id.button)

        addButton.setOnClickListener {
        var first = firstNum.text.toString()
            var second = secondNum.text.toString()

            var add = Integer.valueOf(first) + Integer.valueOf(second)
            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("Result",add)
            startActivity(intent)
        }

    }
}