package com.login.week3day1_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultActivity2 : AppCompatActivity()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)
        
        var txtRes= findViewById<TextView>(R.id.textViewResult)
        var result= intent.getIntExtra("sum",0)
        textViewResult.text =result.toString()
        

        
        
        
        
        
    }
}