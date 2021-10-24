package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number1 = findViewById<EditText>(R.id.Number1)
        var number2 = findViewById<EditText>(R.id.Number2)
        var btnAdd = findViewById<Button>(R.id.btnAdd)


        btnAdd.setOnClickListener {
            var num1 = number1.text.toString().toInt()
            var num2 = number2.text.toString().toInt()
            var result = num1 + num2

            var intent = Intent(this , MainActivity2::class.java)
             intent.putExtra("result" , result)
             startActivity(intent)
        }





    }
}