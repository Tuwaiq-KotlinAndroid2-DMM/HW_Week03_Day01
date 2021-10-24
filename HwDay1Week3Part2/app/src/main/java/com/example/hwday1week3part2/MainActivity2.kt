package com.example.hwday1week3part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewName = findViewById<TextView>(R.id.textViewName)
        var textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        var textViewPhone = findViewById<TextView>(R.id.textViewPhone)
        var textViewGender = findViewById<TextView>(R.id.textViewGender)

        var user:Info? = intent.getSerializableExtra("user") as Info

        if(user != null){
            textViewName.text = user.Name.toString()
            textViewEmail.text = user.Email.toString()
            textViewPhone.text = user.Phone.toString()
            textViewGender.text = user.Gender.toString()

        }


    }
}