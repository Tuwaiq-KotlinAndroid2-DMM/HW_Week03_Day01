package com.example.homeworkweek3day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



       var TextViewRes=findViewById<TextView>(R.id.textViewResult)
        var sumRes = intent.getIntExtra("Sum",1).toString()
        TextViewRes.text=sumRes

    }
}

