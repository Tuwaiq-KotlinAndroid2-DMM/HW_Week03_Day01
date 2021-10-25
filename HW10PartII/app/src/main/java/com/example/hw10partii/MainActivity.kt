package com.example.hw10partii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Objects
        var nameEditText = findViewById<EditText>(R.id.nameEditText)
        var emailEditText = findViewById<EditText>(R.id.emailEditText)
        var phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        var genderEditText = findViewById<EditText>(R.id.genderEditText)
        var btnSignUp = findViewById<Button>(R.id.btnSignUp)

        //Events

        btnSignUp.setOnClickListener {
            var name = nameEditText.text.toString()
            var email = emailEditText.text.toString()
            var phone = phoneEditText.text.toString()
            var gender = genderEditText.text.toString()

            if (emailValidation(emailEditText) && phoneValidation(phoneEditText.toString())) {
                var user = UserModel(name, email, phone, gender)
                var intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
            }


        }


    }

    fun emailValidation(email: EditText): Boolean {
        var email1 = email.text.toString()

        if (!email1.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email1).matches()) {
            Toast.makeText(this, "Email is valid", Toast.LENGTH_SHORT).show()
            return true
        } else {
            Toast.makeText(this, "Email is not valid", Toast.LENGTH_SHORT).show()
            return false
        }


    }
    fun phoneValidation(phone: String?): Boolean {
        var phone1 = phone.toString()

        if (phone1.startsWith("054") || phone1.startsWith("055") || phone1.startsWith("056")) {
            Toast.makeText(this, "Mobile is valid", Toast.LENGTH_SHORT).show()
            return true
        } else {
            Toast.makeText(this, "Mobile is not valid", Toast.LENGTH_SHORT).show()
            return false
        }
    }
}