package com.example.hwweek3day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var result = intent.getIntExtra("Result",-1)

        var textViewResult = findViewById<TextView>(R.id.textViewResult)
        textViewResult.text = result.toString()

    }
}