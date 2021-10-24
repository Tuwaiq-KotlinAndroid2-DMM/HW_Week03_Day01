package com.example.calculatorhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //get intent value
        var result = intent.getIntExtra("result",0)
        //display value after verifying value is not null
        if (result != null){
            findViewById<TextView>(R.id.textViewResultValue).text = result.toString()
        }

    }
}