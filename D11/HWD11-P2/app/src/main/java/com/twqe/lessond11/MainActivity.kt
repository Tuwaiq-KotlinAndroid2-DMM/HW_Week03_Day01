package com.twqe.lessond11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns

import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import model.UserModel




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var uEmail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var username = findViewById<EditText>(R.id.editTextTextPersonName)
        var editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        var editTextGender = findViewById<EditText>(R.id.editTextTextGender)
        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            var name = username.text.toString()
            var email = uEmail.text.toString()
            var phone=editTextPhone.text.toString()
            var gender=editTextGender.text.toString()

            if (emailValidation(uEmail)&& phoneVerification(phone)) {
                var user=UserModel(name, email, phone, gender)
       val intent = Intent(this, MainActivity2::class.java)
       intent.putExtra("UserModel", user)
       startActivity(intent)
        }

    }
}

    fun phoneVerification(editTextPhone: String?): Boolean {
        var phone=editTextPhone.toString()
        if (phone.startsWith("054") || phone.startsWith("055") || phone.startsWith("056")
        ) {
            Toast.makeText(this, "Mobile is valid", Toast.LENGTH_SHORT).show()
            return true

        } else {
            Toast.makeText(this, "Mobile is invalid", Toast.LENGTH_SHORT).show()
            return false
        }
    }

    fun emailValidation(emailEditText: EditText): Boolean {
        var email = emailEditText.text.toString()
        if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "email is valid", Toast.LENGTH_SHORT).show()
            return true
        } else {
            Toast.makeText(this, "email is not valid", Toast.LENGTH_SHORT).show()
            return false
        }
    }

    }
