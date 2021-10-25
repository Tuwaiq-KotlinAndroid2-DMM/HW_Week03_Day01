package com.raialz.hw10.part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.raialz.hw10.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        var textViewName = findViewById<TextView>(R.id.textViewname)
        var textViewEmail = findViewById<TextView>(R.id.textviewEmail)
        var textViewPhone = findViewById<TextView>(R.id.textViewphone)
        var textViewGender = findViewById<TextView>(R.id.textViewGender)
        var user:UserClass? =intent.getSerializableExtra("user")as UserClass?


        if(user != null){
            textViewName.text =  user.name
            textViewEmail.text = user.email
            textViewPhone.text= "966"+user.phone
            textViewGender.text = user.gender
        }



    }
}