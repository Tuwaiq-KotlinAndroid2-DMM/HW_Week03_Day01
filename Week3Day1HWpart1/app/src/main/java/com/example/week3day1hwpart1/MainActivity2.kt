package com.example.week3day1hwpart1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewResul = findViewById<TextView>(R.id.TextViewResult)
        var resultOfSum = intent.getIntExtra("result", 0)
        textViewResul.text = resultOfSum.toString()

    }
}