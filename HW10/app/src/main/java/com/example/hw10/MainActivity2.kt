package com.example.hw10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var ViewSum=findViewById<TextView>(R.id.ViewSum)
        var Result= intent.getIntExtra("Sum",-1)
        ViewSum.text=Result.toString()

    }
}
