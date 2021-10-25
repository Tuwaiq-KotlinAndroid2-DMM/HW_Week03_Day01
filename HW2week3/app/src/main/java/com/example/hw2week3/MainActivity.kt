package com.example.hw2week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                var n1=findViewById<EditText>(R.id.n1)
                var n2=findViewById<EditText>(R.id.n2)
                var add=findViewById<Button>(R.id.add)

                add.setOnClickListener {
                    var firstnumber=n1.text.toString().toInt()
                    var secondnuber=n2.text.toString().toInt()
                    var result=firstnumber+secondnuber
                    var intent= Intent(this, SecondActivity::class.java)
                    intent.putExtra("result",result)
                    startActivity(intent)
                }
            }}
    }
}