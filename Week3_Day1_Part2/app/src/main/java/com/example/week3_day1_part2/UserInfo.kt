package com.example.week3_day1_part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class UserInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        var userNameTextView= findViewById<TextView>(R.id.textViewUsername)
        var emailTextView= findViewById<TextView>(R.id.textViewUserEmail)
        var phoneTextView= findViewById<TextView>(R.id.textViewUserPhone)
        var genderTextView= findViewById<TextView>(R.id.textViewUserGender)

        var user:User? = intent.getSerializableExtra("user") as User?

        if(user!= null){
            userNameTextView.text=user.name
            emailTextView.text=user.email
            phoneTextView.text= user.phone.toString()
            genderTextView.text=user.gender
        }

    }
}