package com.example.passingobjects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.passingobjects.Model.UserModel
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailEditText = findViewById<EditText>(R.id.editTextEmail)
        var nameEditText = findViewById<EditText>(R.id.editTextName)
        var phoneEditText = findViewById<EditText>(R.id.editTextPhone)
        var genderEditText = findViewById<EditText>(R.id.editTextGender)
        var btnGo = findViewById<Button>(R.id.BtnGo)

        btnGo.setOnClickListener{
            var name = nameEditText.text.toString()
            var email = emailEditText.text.toString()
            var phone = phoneEditText.text.toString()
            var gender = genderEditText.text.toString()
            if (emailValidation(emailEditText) && phoneValidation(phoneEditText)){
                var user = UserModel(name,email,phone,gender)
                var intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
            }
        }
    }

    fun emailValidation(emailEditText: EditText): Boolean{
        var email = emailEditText.text.toString()
        if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            //Toast.makeText(this, "Valid Email", Toast.LENGTH_LONG).show()
            return true
        }
        else{
            Toast.makeText(this, "Invalid Email", Toast.LENGTH_LONG).show()
            return false
        }
    }
    fun phoneValidation(phoneEditText: EditText): Boolean{
        var phone = phoneEditText.text.toString()
        if (!phone.isEmpty() && Patterns.PHONE.matcher(phone).matches()){
            //Toast.makeText(this, "Valid Phone", Toast.LENGTH_LONG).show()
            return true
        }
        else{
            Toast.makeText(this, "Invalid Phone", Toast.LENGTH_LONG).show()
            return false
        }
    }

}