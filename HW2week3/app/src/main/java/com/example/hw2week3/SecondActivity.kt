package com.example.hw2week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cursoradapter.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var result = findViewById<TextView>(R.id.textView)
        var sum = intent.getIntExtra("sum",-1)

        result.text = sum.toString()
    }
}