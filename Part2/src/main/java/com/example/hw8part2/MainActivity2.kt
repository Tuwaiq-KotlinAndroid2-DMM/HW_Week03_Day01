package com.example.hw8part2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewName = findViewById<TextView>(R.id.textViewName)
        var textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        var textViewPhone = findViewById<TextView>(R.id.textViewPhone)
        var textViewGender = findViewById<TextView>(R.id.textViewGender)

        var user:UserClass? = intent.getSerializableExtra("user") as UserClass?

        if(user != null){
            textViewName.text =  user.name
            textViewEmail.text = user.email
            textViewPhone.text= "966"+user.phone
            textViewGender.text = user.gender

    }
}}

