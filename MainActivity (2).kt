package com.login.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextTextPersonName = findViewById<TextView>(R.id.editTextName)
        var editTextTextEmailAddress = findViewById<TextView>(R.id.editTextEmail)
        var editTextPhone = findViewById<TextView>(R.id.editTextPhone)
        var editTextTextPersonGender = findViewById<TextView>(R.id.editTextName2)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            var name = editTextTextPersonName.text.toString()
            var email = editTextTextEmailAddress.text.toString()
            var phone = editTextPhone.text.toString()
            var netExt = phone.substring(0, 2)
            var gender = editTextTextPersonGender.text.toString()
            if (emailValidation(editTextTextEmailAddress) && editTextPhone.length() == 9 && (netExt == "54" || netExt == "55" || netExt == "56" || netExt == "59")) {
                var user = UserClass(name, email, phone, gender)
                var intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
            }
        }
    }

    fun emailValidation(ditTextTextEmailAddress: EditText): Boolean {
        var email = ditTextTextEmailAddress.text.toString()

        if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return true
        } else {
            return false
        }
    }
}



