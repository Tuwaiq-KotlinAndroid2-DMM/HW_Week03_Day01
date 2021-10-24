package com.example.hwweek3day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        var textViewResult = findViewById<TextView>(R.id.textViewResult)
        var i = Intent()
        var result = i.getDoubleExtra("Result: ",0.0)
        textViewResult.text = "Result: "+result.toString()
    }
}