package com.example.hw10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var ViewResult = findViewById<TextView>(R.id.textViewResult)
        var sum = intent.getIntExtra("sum",-1)

        ViewResult.text = sum.toString()

    }
}