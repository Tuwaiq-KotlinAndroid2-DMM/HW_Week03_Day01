package com.example.hw10partii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Objects
        var textViewName = findViewById<TextView>(R.id.textViewName)
        var textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        var textViewPhone = findViewById<TextView>(R.id.textViewPhone)
        var textViewGender = findViewById<TextView>(R.id.textViewGender)

        //Call the class
        var user:UserModel? = intent.getSerializableExtra("user") as UserModel

        //Condition
        if(user != null){
            textViewName.text = user.name.toString()
            textViewEmail.text = user.email.toString()
            textViewPhone.text = user.phone.toString()
            textViewGender.text = user.gender.toString()

        }

    }
}