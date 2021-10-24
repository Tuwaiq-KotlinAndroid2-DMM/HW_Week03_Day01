package com.example.hw_week3_day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewResult = findViewById<TextView>(R.id.textViewResult)
        var  result = intent.getDoubleExtra("result",0.0)

        textViewResult.text= "Result\n"+result.toString()
           // intent.getIntExtra("result")


    }
}