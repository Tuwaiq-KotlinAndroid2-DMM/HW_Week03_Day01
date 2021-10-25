package com.raialz.hw10.part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import com.raialz.hw10.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        var editTextTextPersonName = findViewById<EditText>(R.id.editTextTextPersonName)
        var editTextTextEmailAddress = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        var editTextTextPersonGender = findViewById<EditText>(R.id.editTextTextPersonGender)
        var button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
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







