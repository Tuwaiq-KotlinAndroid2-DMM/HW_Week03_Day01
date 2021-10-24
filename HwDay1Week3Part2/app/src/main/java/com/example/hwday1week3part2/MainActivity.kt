package com.example.hwday1week3part2

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

        var emailET = findViewById<EditText>(R.id.editTextEmail)
        var nameET = findViewById<EditText>(R.id.editTextName)
        var editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        var editTextGender = findViewById<EditText>(R.id.editTextGender)
        var buttonSignUp = findViewById<Button>(R.id.ButtonSignUp)


        buttonSignUp.setOnClickListener {
            var name = nameET.text.toString()
            var email = emailET.text.toString()
            var phone = editTextPhone.text.toString()
            var gender = editTextGender.text.toString()


            if (emailValidation(emailET) && NumberValidation(editTextPhone)) {
                var user = Info(name, email, phone, gender)
                var intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
            }


        }
    }
}
    fun emailValidation(emailET: EditText): Boolean{
        var email = emailET.text.toString()
        if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(this,"Valid email", Toast.LENGTH_LONG).show()
            return true
        }else{
            Toast.makeText(this,"InValid email",Toast.LENGTH_LONG).show()
            return false

        }
    }

    fun NumberValidation(editTextPhone: EditText) : Boolean{
        var num = editTextPhone.text.toString()
        var ext = num.substring(0, 2)  // from 0 to 1 and 2 is not included
        if (!num.isEmpty() && Patterns.PHONE.matcher(num).matches()) {
            //Toast.makeText(this,"Valid Number",Toast.LENGTH_LONG).show()
            return true
        }

        else{
            //Toast.makeText(this,"InValid Number",Toast.LENGTH_LONG).show()
               return false
        }
}



