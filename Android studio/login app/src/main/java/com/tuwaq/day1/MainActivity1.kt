package com.tuwaq.day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import model.userModel

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)



//        textViewEmail.text = user.email.toString()
//
        var textViewEmail = findViewById<TextView>(R.id.textViewemail)
        var textViewName = findViewById<TextView>(R.id.textViewname)
        var textViewPhone = findViewById<TextView>(R.id.textViewphone)
        var textViewGender = findViewById<TextView>(R.id.textViewgender)
//        var intent = intent
        var user: userModel? = intent.getSerializableExtra("user") as userModel

        if(user != null){
            textViewEmail.text = user.email.toString()
            textViewName.text = user.name.toString()
            textViewPhone.text = user.phone.toString()
            textViewGender.text = user.gender.toString()


        }



    }
}