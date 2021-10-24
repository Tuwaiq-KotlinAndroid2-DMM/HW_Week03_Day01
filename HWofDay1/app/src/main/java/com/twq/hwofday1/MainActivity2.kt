package com.twq.hwofday1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var textViewResult = findViewById<TextView>(R.id.textViewResult)
        var result = intent.getIntExtra("result",-1)

        textViewResult.text = result.toString()
    }
}