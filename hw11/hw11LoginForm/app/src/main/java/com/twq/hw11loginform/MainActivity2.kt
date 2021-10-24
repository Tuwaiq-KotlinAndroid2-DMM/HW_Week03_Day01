package com.twq.hw11loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.twq.hw11loginform.userModel.UserModel

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var name=findViewById<TextView>(R.id.textViewName)
        var email=findViewById<TextView>(R.id.textViewEmail)
        var phone=findViewById<TextView>(R.id.textViewPhone)
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