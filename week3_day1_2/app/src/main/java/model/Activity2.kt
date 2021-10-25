package model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.week2_day1_2.R

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var textViewemail=findViewById<TextView>(R.id.textViewemail)
        var textViewname=findViewById<TextView>(R.id.textViewname)
        var intent= intent
        var viewResult=findViewById<TextView>(R.id.viewResult)
        var textViewgender=findViewById<TextView>(R.id.textViewgender)
        var user:usermodel?=intent.getSerializableExtra("user")as usermodel

        if (user != null){
            textViewemail.text=user.email.toString()
            textViewname.text=user.name.toString()
            viewResult.text=user.phone.toString()
            textViewgender.text=user.gender.toString()

        }

    }
}