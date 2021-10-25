package com.example.week2_day1_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import model.Activity2
import model.usermodel
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var EditTextEmail=findViewById<EditText>(R.id.EditTextEmail)
        var editTextName=findViewById<TextView>(R.id.editTextName)
        var button=findViewById<Button>(R.id.button)

        var editTextPhone=findViewById<EditText>(R.id.editTextPhone)
        var viewResult=findViewById<TextView>(R.id.viewResult)
        var editTextgender=findViewById<EditText>(R.id.editTextgender)



        button.setOnClickListener {
            var name=editTextName.text.toString()
            var email=EditTextEmail.text.toString()
            var phone=editTextPhone.text.toString()
            var gender=editTextgender.text.toString()

            if (emailValidation(EditTextEmail)){

                var user=usermodel(email,name,phone,gender)
                var intent = Intent( this , Activity2::class.java)
                intent.putExtra("user",user)
                startActivity(intent)

                val phoneNum=editTextPhone.text.toString()
                var netExt=phoneNum.substring(0,2)

                if (phoneNum.length==9 && ( netExt == "55" || netExt== "56" ||netExt== "54")) {

                    viewResult.text="Welcome"

                }else{
                    viewResult.text="Invalid Number"

                }

            }
        }
    }
    fun emailValidation (EditTextEmail:EditText):Boolean{
        var email=EditTextEmail.text.toString()

        if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(this,"Email is Valid",Toast.LENGTH_SHORT).show()
            return true
        }else{
            Toast.makeText(this,"Email is not valid",Toast.LENGTH_SHORT).show()
            return false
        }
    }
}