package com.example.partii_signuphw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.*
import com.example.partii_signuphw.Model.UserModel

class MainActivity : AppCompatActivity() {

    var serviceProviderCodes = mutableListOf("054", "055", "056")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSignUp = findViewById<Button>(R.id.buttonSignUp)

        btnSignUp.setOnClickListener {
            var nameEditText = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
            var phoneNumEditText = findViewById<EditText>(R.id.editTextPhone).text.toString()
            var emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
            var genderRadioButton = findViewById<RadioGroup>(R.id.radioGroupGender).checkedRadioButtonId
            var genderselected = findViewById<RadioButton>(genderRadioButton).text.toString()

            if (emailVerification(emailEditText) && mobileVerification(phoneNumEditText) && nameEditText.isNotEmpty()){
                var userInfo = UserModel(nameEditText, emailEditText, phoneNumEditText, genderselected)
                //Create intent
                val intent = Intent(this, MainActivity2::class.java)
                //put user model into intent
                intent.putExtra("userModel", userInfo)
                startActivity(intent)
            }
        }
    }

    fun mobileVerification(mobile: String): Boolean {
        val serviceProviderCode = mobile.substring(0, 3)
        val phoneValidation = serviceProviderCodes.filter { (it == serviceProviderCode) }
        if (phoneValidation.isNotEmpty() && mobile.length == 10) {
            Toast.makeText(this, "Mobile is valid", Toast.LENGTH_SHORT).show()
            return true
        } else {
            Toast.makeText(this, "Mobile is invalid", Toast.LENGTH_SHORT).show()
            return false
        }
    }

    fun emailVerification(email: String): Boolean {
        //verify email is not empty and the email is in a correct format
        if (email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Email is valid", Toast.LENGTH_SHORT).show()
            return true
        } else {
            Toast.makeText(this, "Email is invalid", Toast.LENGTH_SHORT).show()
            return false
        }
    }
}