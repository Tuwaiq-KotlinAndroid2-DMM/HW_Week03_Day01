package com.example.homewoorkw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondactivit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivit)

        var textViewR = findViewById<TextView>(R.id.textViewResult)
        var i = Intent()
        var add = i.getDoubleExtra("Result: ",0.0)
        textViewR.text = "Result: "+add.toString()
    }
}