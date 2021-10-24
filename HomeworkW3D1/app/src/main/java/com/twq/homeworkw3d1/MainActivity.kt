package com.twq.homeworkw3d1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstEditText = findViewById<EditText>(R.id.editTextNumber1)
        var secondEditText = findViewById<EditText>(R.id.editTextNumber2)
        var addButton = findViewById<Button>(R.id.buttonAdd)


        addButton.setOnClickListener {
            var first:Int = firstEditText.text.toString().toInt()
            var second:Int = secondEditText.text.toString().toInt()
            var sum = first+second
            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("sum",sum)
            startActivity(intent)
        }
    }
}