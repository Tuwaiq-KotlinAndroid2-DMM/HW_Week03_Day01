package com.example.hw_week3_day1_p2_registerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextName = findViewById<EditText>(R.id.editTextName)
        var editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        var editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        var editTextGender = findViewById<EditText>(R.id.editTextGender)
        var buttonSignUp = findViewById<Button>(R.id.buttonSignUp)

        buttonSignUp.setOnClickListener {


            var name = editTextName.text.toString()
            var email = editTextEmail.text.toString()
            var phone = editTextPhone.text.toString()
            var gender = editTextGender.text.toString()


            if(emailValidation(editTextEmail) && PhoneValidation(editTextPhone) ){


                var user = UserInfo(name,email,phone,gender)
                var intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("user",user)

                startActivity(intent)
            }



        }

    }

    fun emailValidation(editTextEmail:EditText):Boolean{
        var email = editTextEmail.text.toString()

        if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){

            Toast.makeText(this, "Email valid", Toast.LENGTH_SHORT).show()
            return true
        }

        else{

            Toast.makeText(this, "Email is not valid", Toast.LENGTH_SHORT).show()
            return false
        }

    }
    fun PhoneValidation(editTextPhone:EditText):Boolean{
        var phone = editTextPhone.text.toString()

        if (!phone.isEmpty()&& phone.length==10 && phone.startsWith("056") || phone.startsWith("054")|| phone.startsWith("055")){
            Toast.makeText(this, "Phone valid", Toast.LENGTH_SHORT).show()
            return true

        }
        else{
            Toast.makeText(this, "Phone is not valid", Toast.LENGTH_SHORT).show()
        }
        return false

    }
}