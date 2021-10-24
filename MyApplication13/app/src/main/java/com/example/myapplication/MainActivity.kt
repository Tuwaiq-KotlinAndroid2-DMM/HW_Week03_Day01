package com.example.myapplication

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
        var name = findViewById<EditText>(R.id.name)
        var email = findViewById<EditText>(R.id.email)
        var phone = findViewById<EditText>(R.id.phone)
        var gender = findViewById<EditText>(R.id.gender)

        var signup = findViewById<Button>(R.id.signup)

        signup.setOnClickListener {

            var name1 = name.text.toString()
            var email1 = email.text.toString()
            var phone1 = phone.text.toString()
            var gender1 = gender.text.toString()


            if(emailValidation(email)&&phoneVerification(phone.toString())){
                var user =UsermMdel(name1,email1,phone1,gender1)
                var intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("UsermMdel", user)
                startActivity(intent)
            }
        }

    }fun emailValidation(email: EditText): Boolean{
        var email1 = email.text.toString()

        if(!email1.isEmpty() &&Patterns.EMAIL_ADDRESS.matcher(email1).matches()){
            Toast.makeText(this, "Email is valid", Toast.LENGTH_SHORT).show()
            return true
        }
        else {
            Toast.makeText(this, "Email is not valid", Toast.LENGTH_SHORT).show()
            return false
        }
    }

    fun phoneVerification(phone: String?): Boolean {
        var phone2=phone.toString()
        if (phone2.startsWith("054") || phone2.startsWith("055") || phone2.startsWith("056")
        ) {
            Toast.makeText(this, "Mobile is valid", Toast.LENGTH_SHORT).show()
            return true

        } else {
            Toast.makeText(this, "Mobile is invalid", Toast.LENGTH_SHORT).show()
            return false
        }
    }

}

