package com.example.week3day1hwp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewName =findViewById<TextView>(R.id.textViewName)
        var textViewPhone =findViewById<TextView>(R.id.textViewPhone)
        var textViewEmail =findViewById<TextView>(R.id.textViewEmail)
        var textViewGender =findViewById<TextView>(R.id.textViewGender)

      var user=  intent.getSerializableExtra("user") as UserModel

        textViewName.text = user.name
        textViewPhone.text = user.phone.toString()
        textViewEmail.text = user.email
        textViewGender.text = user.gender


    }
}