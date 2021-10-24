package com.twq.hwovaldation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.twq.hwovaldation.userModel.UserModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editTextEmail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var editTextName = findViewById<EditText>(R.id.editTextName)
        var editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        var editTextGender = findViewById<EditText>(R.id.editTextGender)
        var buttonSignup = findViewById<Button>(R.id.buttonSignup)
//        var textViewEmailValidation = findViewById<TextView>(R.id.textViewEmailValdation)
//        var textViewPhoneValidation = findViewById<TextView>(R.id.textViewPhoneValidation)

        buttonSignup.setOnClickListener {
            // once button clicked, collect info
            var name = editTextName.text.toString()
            var email = editTextEmail.text.toString()
            var phone = editTextPhone.text.toString()
            var gender = editTextGender.text.toString()

            //give a message in red that if email or phone is invalid
            emailValidation(editTextEmail)
            phoneValidation(editTextPhone)
            //if every thing okay, intent to the second activity
           if (emailValidation(editTextEmail)&&phoneValidation(editTextPhone)) {

               var user = UserModel(name, email, phone, gender)

               var intent = Intent(this, MainActivity2::class.java)
               intent.putExtra("user", user)

               startActivity(intent)
           }

        }

    }
    // func to check email validation
    fun emailValidation (editTextEmail: EditText): Boolean {
        var email = editTextEmail.text.toString()
        //patterns.EMAIL_ADDRESS checks for empty string as well.
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            var textViewEmailValidation = findViewById<TextView>(R.id.textViewEmailValdation)
            textViewEmailValidation.text = "Email is invalid"
            return false
        }
        var textViewEmailValidation = findViewById<TextView>(R.id.textViewEmailValdation)
        textViewEmailValidation.text = ""
        return true
    }

    // a fun to check for phone validation
    fun phoneValidation(editTextPhone: EditText): Boolean {
        var phone = editTextPhone.text.toString()
        var saudiCode = phone.subSequence(0,2)
        if (Patterns.PHONE.matcher(phone).matches() && phone.length == 9 && (saudiCode == "55"|| saudiCode == "54"|| saudiCode == "56")){
            var textViewPhoneValidation = findViewById<TextView>(R.id.textViewPhoneValidation)
            textViewPhoneValidation.text = ""
            return true
        }
        var textViewPhoneValidation = findViewById<TextView>(R.id.textViewPhoneValidation)
        textViewPhoneValidation.text = "Phone is invalid"
        return false
    }
}