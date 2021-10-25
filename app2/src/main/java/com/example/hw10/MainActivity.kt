package com.example.hw10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.hw10.Model.UserModel
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nameText = findViewById<EditText>(R.id.editTextTextName)
        var emailText = findViewById<EditText>(R.id.editTextEmail)
        var phoneText = findViewById<EditText>(R.id.editTextPhone)
        var genderText = findViewById<EditText>(R.id.editTextGender)
        var signUp = findViewById<Button>(R.id.button)

        signUp.setOnClickListener {
            var name = nameText.text.toString()
            var email = emailText.text.toString()
            var phone = phoneText.text.toString()
            var gender = genderText.text.toString()
            var userModel = UserModel(name, email, phone, gender)
            var intent = Intent(this, MainActivity2::class.java)
            if (Patterns.PHONE.matcher(phone).matches() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                intent.putExtra("userModel", userModel)
                startActivity(intent)
            }else {
                Toast.makeText(this, "Incorrect Data", Toast.LENGTH_SHORT).show()
            }
        }
    }
}