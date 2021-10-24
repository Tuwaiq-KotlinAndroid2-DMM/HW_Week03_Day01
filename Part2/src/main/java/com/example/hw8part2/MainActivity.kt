package com.example.hw8part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnSignUp = findViewById<Button>(R.id.buttonSignUp)
        var nameEditText = findViewById<EditText>(R.id.editTextName)
        var phoneNumEditText = findViewById<EditText>(R.id.editTextPhone)
        var emailEditText = findViewById<EditText>(R.id.editTextEmail)
        var genderEditText = findViewById<EditText>(R.id.editTextEmail)



        btnSignUp.setOnClickListener {
            var name = nameEditText.text.toString()
            var email = emailEditText.text.toString()
            var phone = phoneNumEditText.text.toString()
            var gender = genderEditText.text.toString()

            //******** Phone Validation && Call Email Validation
            var networkEXT = phone.substring(0, 2)
            if (emailValidation(emailEditText) && networkEXT.isNotEmpty() && networkEXT.length == 10)
            var user = UserClass(name, email, phone, gender)
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("user", user)
            startActivity(intent)


        }}}

            //******** Email Validation
            fun emailValidation(emailEditText: EditText): Boolean {
                var email = emailEditText.text.toString()

                if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    return true
                } else {
                    return false
                }
            }

