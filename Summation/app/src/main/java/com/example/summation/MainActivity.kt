package com.example.summation

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

        var editTextFirstNumber = findViewById<EditText>(R.id.editTextFisrtNum)
        var editTextSecNumber = findViewById<EditText>(R.id.editTextSecondNum)
        var btnAdd = findViewById<Button>(R.id.ButtonAdd)

        btnAdd.setOnClickListener {
            var firstNum = editTextFirstNumber.text.toString()
            var secNum = editTextSecNumber.text.toString()
            if(!firstNum.isEmpty() && !secNum.isEmpty()) {
                var sum = Integer.valueOf(firstNum) + Integer.valueOf(secNum)

                //Declare ans start the explicit intent
                var intent = Intent(this, Activity2::class.java)
                intent.putExtra("Sum", sum)
                startActivity(intent)
            }
            else
                Toast.makeText(this, "You have to enter 2 numbers!", Toast.LENGTH_LONG).show()
        }

    }
}