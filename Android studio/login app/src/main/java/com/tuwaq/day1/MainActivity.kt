package com.tuwaq.day1

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import model.userModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailedittext = findViewById<EditText>(R.id.editTextEmail)
        var nameedittext = findViewById<EditText>(R.id.editTextTName)
        var phoneedittext = findViewById<EditText>(R.id.editTextPhone)
        var genderedittext = findViewById<EditText>(R.id.editTextgender)

        var buttongo = findViewById<Button>(R.id.buttongo)

        buttongo.setOnClickListener {

            var name = nameedittext.text.toString()
            var email = emailedittext.text.toString()
            var phone = phoneedittext.text.toString()
            var gender = genderedittext.text.toString()


            if(emailValidation(emailedittext)){
                var user = userModel(name,email,phone,gender)
                var intent = Intent(this, MainActivity1::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
            }
        }

        }fun emailValidation(emailEditText: EditText): Boolean{
            var email = emailEditText.text.toString()

            if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                Toast.makeText(this, "Email is valid", Toast.LENGTH_SHORT).show()
                return true
            }
            else {
                Toast.makeText(this, "Email is not valid", Toast.LENGTH_SHORT).show()
                return false
            }
        }

    }












