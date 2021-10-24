package com.example.homeworkweek3day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        var number1=findViewById<EditText>(R.id.editTextNumber1)
        var number2=findViewById<EditText>(R.id.editTextNumber2)
       var  AddBtn=findViewById<Button>(R.id.AddBtn)


        AddBtn.setOnClickListener {

            var num1=number1.text.toString()
            var num2= number2.text.toString()
            var res = Integer.valueOf(num1)+ Integer.valueOf(num2)

            var intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("Sum",res)
            startActivity(intent)

        }

    }
}