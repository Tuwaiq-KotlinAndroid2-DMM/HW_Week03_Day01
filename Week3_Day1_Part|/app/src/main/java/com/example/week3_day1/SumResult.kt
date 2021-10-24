package com.example.week3_day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SumResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum_result)
        var resultTextView= findViewById<TextView>(R.id.textViewNum)
        var result= intent.getIntExtra("sum",-1)
        resultTextView.text= result.toString()

    }
}