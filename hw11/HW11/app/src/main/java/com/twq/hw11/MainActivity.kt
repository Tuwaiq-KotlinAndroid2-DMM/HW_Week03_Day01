package com.twq.hw11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editTextNumber1=findViewById<EditText>(R.id.editTextNumber1)
        var editTextNumber2=findViewById<EditText>(R.id.editTextNumber2)
        var buttonAdd=findViewById<Button>(R.id.buttonAdd)

        buttonAdd.setOnClickListener {
            var number1=editTextNumber1.text.toString().toInt()
            var number2=editTextNumber2.text.toString().toInt()
            var sum =number1+number2
            var intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("sum",sum)
            startActivity(intent)
        }
    }
}