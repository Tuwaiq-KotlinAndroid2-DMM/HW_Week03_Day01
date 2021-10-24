package com.twqe.hwday11

import UserModel.UserModel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class sumResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum_result)
        var num1=findViewById<EditText>(R.id.editTextNumber1)
        var num2=findViewById<EditText>(R.id.editTextNumber2)
        var add=findViewById<Button>(R.id.addButton)

        var textViewResult = findViewById<TextView>(R.id.textViewResult)
        var result=intent.getIntExtra("sum",0)
        textViewResult.text = result.toString()
      /*  add.setOnClickListener() {
            var number1=num1.text.toString()
            var number2=num2.text.toString()
            var sum=number1.toInt()+number2.toInt()
            var sumResult= UserModel(sum)
            val intent = Intent(this, sumResult::class.java)
            intent.putExtra("sum", sum)
            startActivity(intent)
        }*/
    }
}