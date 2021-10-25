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

        var editTextNum1=findViewById<EditText>(R.id.editTextTNum1)
        var editTextNum2=findViewById<EditText>(R.id.editTextNum2)
        var btnAdd=findViewById<Button>(R.id.btnAdd)


        btnAdd.setOnClickListener {
            var Num1=editTextNum1.text.toString().toInt()
            var Num2=editTextNum2.text.toString().toInt()
            var Sum= Num1+Num2
            var intent = Intent( this , MainActivity2::class.java)
            intent.putExtra("Sum",Sum)
            startActivity(intent)

        }
    }
}
