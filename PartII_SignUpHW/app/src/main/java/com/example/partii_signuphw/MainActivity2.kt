package com.example.partii_signuphw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.partii_signuphw.Model.UserModel

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var userInfo = intent.getSerializableExtra("userModel") as UserModel?

        if (userInfo != null){
            findViewById<TextView>(R.id.textViewNameValue).text = userInfo.username
            findViewById<TextView>(R.id.textViewEmailValue).text = userInfo.email
            findViewById<TextView>(R.id.textViewPhoneValue).text = userInfo.mobile
            findViewById<TextView>(R.id.textViewGendervalue).text = userInfo.gender
        }

    }
}