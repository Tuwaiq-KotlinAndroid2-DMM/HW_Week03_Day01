package com.example.hw10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Addbutton =findViewById<Button>(R.id.buttonAdd)
        var fNumber=findViewById<EditText>(R.id.editTextFirstNumber)
        var sNumber=findViewById<EditText>(R.id.editTextSecondNumber)

        Addbutton.setOnClickListener {
            var FirstNumber:Int = fNumber.text.toString().toInt()
            var SecondNumber:Int = sNumber.text.toString().toInt()
            var sum = FirstNumber+SecondNumber
            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("sum",sum)
            startActivity(intent)
        }

    }
}

