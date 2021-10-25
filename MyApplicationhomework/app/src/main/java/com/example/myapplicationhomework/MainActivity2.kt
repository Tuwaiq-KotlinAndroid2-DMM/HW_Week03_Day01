package com.example.myapplicationhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var result=findViewById<TextView>(R.id.textViewresult)
        var intent=intent.getIntExtra("sum",1)
        result.text=intent.toString()
    }
}