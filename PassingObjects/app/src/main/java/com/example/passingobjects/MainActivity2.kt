package com.example.passingobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.passingobjects.Model.UserModel

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        var textViewName = findViewById<TextView>(R.id.textViewName)
        var textViewPhone = findViewById<TextView>(R.id.textViewPhone)
        var textViewGender = findViewById<TextView>(R.id.textViewGender)

        //var intent = intent
        var user : UserModel? = intent.getSerializableExtra("user") as UserModel?

        if (user != null){
            textViewEmail.text=user.email
            textViewName.text=user.name
            textViewPhone.text=user.phone
            textViewGender.text=user.gender
        }
    }
}