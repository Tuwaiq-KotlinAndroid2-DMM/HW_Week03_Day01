package com.example.hww3d1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var result=findViewById<TextView>(R.id.result)
        var viewresult=intent.getIntExtra("result",-1)
        result.text=viewresult.toString()
    }
}