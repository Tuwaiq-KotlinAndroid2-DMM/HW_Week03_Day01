package com.example.myapplicationhw22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var name=findViewById<TextView>(R.id.textViewname)
        var email=findViewById<TextView>(R.id.textViewemail)
        var phone=findViewById<TextView>(R.id.textViewphone)
        var gender=findViewById<TextView>(R.id.textViewGender)

        var user:UserModel? = intent.getSerializableExtra("user") as UserModel?

        if (user != null) {
            name.text = user.name
            email.text = user.email
            phone.text=user.phone
            gender.text=user.gender
        }
    }
}