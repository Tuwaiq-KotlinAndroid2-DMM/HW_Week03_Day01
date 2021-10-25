package com.raialz.hw10.part1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.raialz.hw10.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        var editTextNumber3 = findViewById<EditText>(R.id.editTextNumber3)
        var button = findViewById<Button>(R.id.button)


        button.setOnClickListener{
            var first:Int =  editTextNumber.text.toString().toInt()
            var second:Int = editTextNumber3.text.toString().toInt()
            var sum = first+second
            var intent =Intent(this,MainActivity2::class.java)
            intent.putExtra("sum",sum)
            startActivity(intent)


        }













    }
}