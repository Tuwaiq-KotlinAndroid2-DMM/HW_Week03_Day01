package com.twq.homeworkw3d1q2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.twq.homeworkw3d1q2.model.UserClass

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewName = findViewById<TextView>(R.id.textViewName1)
        var textViewEmail = findViewById<TextView>(R.id.textViewEmail1)
        var textViewPhone = findViewById<TextView>(R.id.textViewPhone1)
        var textViewGender = findViewById<TextView>(R.id.textViewGender1)
        var user:UserClass? = intent.getSerializableExtra("user") as UserClass?

        if(user != null){
            textViewName.text =  user.name
            textViewEmail.text = user.email
            textViewPhone.text= "966"+user.phone
            textViewGender.text = user.gender
        }


    }
}