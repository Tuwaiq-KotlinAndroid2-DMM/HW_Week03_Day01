package com.example.hw_week3_day1_p2_registerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var textViewUserName = findViewById<TextView>(R.id.textViewUserName)
        var textViewUserEmail = findViewById<TextView>(R.id.textViewUserEmail)
        var  textViewUserPhone = findViewById<TextView>(R.id. textViewUserPhone)
        var textViewUserGender = findViewById<TextView>(R.id.textViewUserGender)

        var user:UserInfo? = intent.getSerializableExtra("user") as UserInfo

        if (user != null){

            textViewUserName.text = user.Name.toString()
            textViewUserEmail.text = user.Email.toString()
            textViewUserPhone.text = user.Phone.toString()
            textViewUserGender.text = user.Gender.toString()
        }



    }
}