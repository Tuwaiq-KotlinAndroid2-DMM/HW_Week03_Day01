package com.example.week3day1hwp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextName = findViewById<EditText>(R.id.editTextName).text.toString()
        var editTextPhone = findViewById<EditText>(R.id.editTextPhone).text.toString().toInt()
        var editTextEmail = findViewById<EditText>(R.id.editTextEmail).text.toString()
        var editTextGender = findViewById<EditText>(R.id.editTextGender).text.toString()
        var buttonSignup = findViewById<Button>(R.id.buttonSignUp)

        buttonSignup.setOnClickListener {

            if (CheckEmail(editTextEmail) && CheckPhone(editTextPhone.toString())){
                var user =UserModel(editTextName ,editTextPhone,editTextEmail,editTextGender)
                var intent=Intent(this,MainActivity2::class.java)
                intent.putExtra("user",user)
                startActivity(intent)
            }
        }

    }
    fun CheckPhone(phone: String):Boolean {


        if (phone.startsWith("54") || phone.startsWith("55")
            || phone.startsWith("56") && phone.length.equals(9)
        ) {
            Toast.makeText(this, "Valid", Toast.LENGTH_SHORT).show()
            return true
        } else {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()
            return false
        }
    }

    fun CheckEmail(email:String):Boolean{

        if (email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Valid", Toast.LENGTH_SHORT).show()
            return true
        }
        else{
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()
            return false

        }


    }
}






