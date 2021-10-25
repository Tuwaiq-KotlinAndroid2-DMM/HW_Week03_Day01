package com.example.hw2week3.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.hw2week3.R

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        var textname = findViewById<TextView>(R.id.textname)
        var textemail = findViewById<TextView>(R.id.textemail)
        var textphone = findViewById<TextView>(R.id.textphone)
        var textgender = findViewById<TextView>(R.id.textgender)
        var user: UsermModel? = intent.getSerializableExtra("UsermModel") as UsermModel

        if(user != null){
            textname.text = user.name1
            textemail.text = user.email1
            textphone.text = user.phone1
            textgender.text = user.gender1
        }
    }
}

