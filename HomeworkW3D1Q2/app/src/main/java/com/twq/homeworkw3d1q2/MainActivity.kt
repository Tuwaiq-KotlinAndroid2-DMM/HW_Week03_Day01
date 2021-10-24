package com.twq.homeworkw3d1q2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.twq.homeworkw3d1q2.model.UserClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailEditText = findViewById<EditText>(R.id.editTextEmail)
        var nameEditText = findViewById<EditText>(R.id.editTextName)
        var phoneEditText = findViewById<EditText>(R.id.editTextNumber)
        var genderEditText = findViewById<EditText>(R.id.editTextGender)
        var button = findViewById<Button>(R.id.buttonLogin)

        button.setOnClickListener {
            var name = nameEditText.text.toString()
            var email = emailEditText.text.toString()
            var phone = phoneEditText.text.toString()
            var netExt = phone.substring(0,2)
            var gender = genderEditText.text.toString()
            if (emailValidation(emailEditText) && phoneEditText.length()==9 && (netExt=="54"||netExt=="55"||netExt=="56"||netExt=="59")){
                var user = UserClass(name,email,phone,gender)
                var intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("user",user)
                startActivity(intent)
            }
        }
    }

    fun emailValidation(emailEditText: EditText): Boolean{
        var email = emailEditText.text.toString()

        if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return true
        }else{
            return false
        }
    }
}

