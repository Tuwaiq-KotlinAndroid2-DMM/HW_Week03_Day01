package com.example.hw10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hw10.Model.UserModel

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var userModel = intent.getSerializableExtra("userModel") as UserModel
        var nameText2 = findViewById<TextView>(R.id.textViewName2)
        var emailText2 = findViewById<TextView>(R.id.textViewEmail2)
        var phoneText2 = findViewById<TextView>(R.id.textViewPhone2)
        var genderText2 = findViewById<TextView>(R.id.textViewGender2)
        nameText2.text = userModel.name
        emailText2.text = userModel.email
        phoneText2.text = userModel.phone
        genderText2.text = userModel.gender
    }
}