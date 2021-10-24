package com.twqe.hwday11

import UserModel.UserModel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
/*        setContentView(R.layout.activity_main)
        var num1=findViewById<EditText>(R.id.editTextNumber1)
        var num2=findViewById<EditText>(R.id.editTextNumber2)
        var add=findViewById<Button>(R.id.addButton)
        add.setOnClickListener {
            var number1=num1.text.toString()
            var number2=num2.text.toString()
            var sum=number1.toInt()+number2.toInt()
//            Toast.makeText(this, sum, Toast.LENGTH_SHORT).show()
            var intent=Intent(this,sumResult::class.java)
            intent.putExtra("sum",sum)
            startActivity(intent)
        }*/
        var num1=findViewById<EditText>(R.id.editTextNumber1)
        var num2=findViewById<EditText>(R.id.editTextNumber2)
        var add=findViewById<Button>(R.id.addButton)

        add.setOnClickListener() {
            var number1=num1.text.toString()
            var number2=num2.text.toString()
            var sum=number1.toInt()+number2.toInt()
           var intent = Intent(this, sumResult::class.java)
            intent.putExtra("sum", sum)
            startActivity(intent)
        }
    }
}

