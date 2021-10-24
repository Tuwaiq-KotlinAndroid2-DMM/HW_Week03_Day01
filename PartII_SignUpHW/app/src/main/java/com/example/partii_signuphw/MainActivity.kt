package com.example.partii_signuphw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSignUp = findViewById<Button>(R.id.buttonSignUp)

        btnSignUp.setOnClickListener {
            var nameEditText = findViewById<EditText>(R.id.editTextTextPersonName)
            var phoneNumEditText = findViewById<EditText>(R.id.editTextPhone)
            var emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
            var maleGenderRadioButton = findViewById<RadioButton>(R.id.radioButtonMale)
            var femaleGenderRadioButton = findViewById<RadioButton>(R.id.radioButtonFemale)
        }
    }
}