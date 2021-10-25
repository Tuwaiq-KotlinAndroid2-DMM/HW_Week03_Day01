package com.raialz.hw10.part1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.raialz.hw10.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var result = findViewById<TextView>(R.id.textView)
        var summation = intent.getIntExtra("sum",-1)

        result.text = summation.toString()
    }
}