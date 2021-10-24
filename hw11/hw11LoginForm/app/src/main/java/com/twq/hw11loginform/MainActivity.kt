package com.twq.hw11loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.twq.hw11loginform.userModel.UserModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editTextName=findViewById<EditText>(R.id.editTextPersonName)
        var editTextEmail=findViewById<EditText>(R.id.editTextEmailAddress)
        var editTextPhone=findViewById<EditText>(R.id.editTextPhone)
        var editTextGender=findViewById<EditText>(R.id.editTextGender)
        var buttomSignUp=findViewById<Button>(R.id.buttonSignUp)

        buttomSignUp.setOnClickListener {
            var name= editTextName.text.toString()
            var email= editTextEmail.text.toString()
            var phone= editTextPhone.text.toString()
            var gender= editTextGender.text.toString()

            if (emailValidation(editTextEmail) && phoneVaildation(editTextPhone)){
                var user = UserModel(name, email,phone,gender)
                var intent= Intent(this, MainActivity2::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
            }
        }

    }
    fun emailValidation(emailEditText: EditText): Boolean {
        var email= emailEditText.text.toString()

        if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(this, "Email is valid", Toast.LENGTH_SHORT).show()
            return true

        }else{
            Toast.makeText(this, "Email is not valid", Toast.LENGTH_SHORT).show()
            return false
        }

    }
    fun phoneVaildation(editTextPhone: EditText):Boolean{
        var phone= editTextPhone.text.toString()

        if(!phone.isEmpty() && Patterns.PHONE.matcher(phone).matches()){
            Toast.makeText(this, "Email is valid", Toast.LENGTH_SHORT).show()
            return true

        }else{
            Toast.makeText(this, "Email is not valid", Toast.LENGTH_SHORT).show()
            return false
        }
    }

}