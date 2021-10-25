package com.example.homewoorkw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var textname = findViewById<TextView>(R.id.textname)
        var textemail = findViewById<TextView>(R.id.textemail)
        var textphone = findViewById<TextView>(R.id.textphone)
        var textgender = findViewById<TextView>(R.id.textgender)


        var user: Name? = intent.getSerializableExtra("UsermMdel") as Name

        if(user != null){
            textname.text = user.name1
            textemail.text = user.email1
            textphone.text = user.phone1
            textgender.text = user.gender1


        }



    }
}





