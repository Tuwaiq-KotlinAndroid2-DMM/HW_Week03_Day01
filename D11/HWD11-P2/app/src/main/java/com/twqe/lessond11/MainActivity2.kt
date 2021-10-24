package com.twqe.lessond11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import model.UserModel

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var textViewEmail = findViewById<TextView>(R.id.textViewName)
        var textViewName = findViewById<TextView>(R.id.textViewEmail)
        var textViewPhone = findViewById<TextView>(R.id.textViewPhone)
        var textViewGender = findViewById<TextView>(R.id.textViewGender)
        var user : UserModel?= intent.getSerializableExtra("UserModel") as UserModel
        if (user != null) {
           textViewName.text = user.name
            textViewEmail.text = user.email
            textViewPhone.text = user.phone
            textViewGender.text = user.gender
        }


}
}