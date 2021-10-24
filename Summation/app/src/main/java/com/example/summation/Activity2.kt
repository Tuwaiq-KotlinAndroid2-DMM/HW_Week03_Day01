package com.example.summation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        var textViewResult = findViewById<TextView>(R.id.textViewResult)
        var sumReslut = intent.getIntExtra("Sum",-1).toString()
        textViewResult.text="Result $sumReslut"


    }
}


