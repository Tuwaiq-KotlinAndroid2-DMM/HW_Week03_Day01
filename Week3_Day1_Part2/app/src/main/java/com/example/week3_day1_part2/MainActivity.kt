package com.example.week3_day1_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nameEditText= findViewById<EditText>(R.id.editTextName)
        var emailEditText= findViewById<EditText>(R.id.editTextEmail)
        var phoneEditText= findViewById<EditText>(R.id.editTextNumber)
        var GenderEditText= findViewById<EditText>(R.id.editTextGender)
        var SignUpButtoun= findViewById<Button>(R.id.buttonSignUp)

        SignUpButtoun.setOnClickListener {

            var name= nameEditText.text.toString()
            var email = emailEditText.text.toString()
            var phone= phoneEditText.text.toString().toInt()
            var gender= GenderEditText.text.toString()

            var user=User(name,email,phone,gender)

            var intent= Intent(this,UserInfo::class.java)
            intent.putExtra("user",user)
            startActivity(intent)


        }

    }
}