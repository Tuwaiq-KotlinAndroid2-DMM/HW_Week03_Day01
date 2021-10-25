package com.login.week3day1_hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText1= findViewById<TextView>(R.id.editTextNum1)
        var editText2= findViewById<TextView>(R.id.editTextNum2)
        var button= findViewById<Button>(R.id.buttonAdd)

        button.setOnClickListener {
            var Fn1= editText1.text.toString()
            var Sn2= editText2.text.toString()

            var i= Integer.valueOf(Fn1) + Integer.valueOf(Sn2)
            var intent= Intent(this,resultActivity2::class.java)
            intent.putExtra("Result",i)
            startActivity(intent)
        }






















    }
}