package com.example.homewoorkw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            var name = findViewById<EditText>(R.id.textname)
            var email = findViewById<EditText>(R.id.textemail)
            var phone = findViewById<EditText>(R.id.Phone)
            var gender = findViewById<EditText>(R.id.gender)

            var button = findViewById<Button>(R.id.button)

            button.setOnClickListener {

                var name1 = name.text.toString()
                var email1 = email.text.toString()
                var phone1 = phone.text.toString()
                var gender1 = gender.text.toString()




                if (emailValidation(email) && phoneVerification(phone)) {
                    var user = Name(name1, email1, phone1, gender1)
                    var intent = Intent(this, MainActivity2::class.java)
                    intent.putExtra("UsermMdel", user)
                    startActivity(intent)
                }


            }
        }
    }
}

        fun emailValidation(email: EditText): Boolean {
            var email1 = email.text.toString()


            if (!email1.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email1).matches()) {
                return true
            } else {
                return false
            }
        }


        fun phoneVerification(phone: EditText): Boolean {
            var phone2=phone.toString()
            if (phone2.startsWith("054") || phone2.startsWith("055") || phone2.startsWith("056")) {
                return true

            } else {
                return false
            }
        }

