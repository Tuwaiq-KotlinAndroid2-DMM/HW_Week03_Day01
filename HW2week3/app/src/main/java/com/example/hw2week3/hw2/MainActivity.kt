package com.example.hw2week3.hw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.hw2week3.R
import com.example.hw2week3.SecondActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)






        var textname = findViewById<EditText>(R.id.textname)
        var textemail = findViewById<EditText>(R.id.textemail)
        var textphone = findViewById<EditText>(R.id.textphone)
        var textgender = findViewById<EditText>(R.id.textgender)

        var signup = findViewById<Button>(R.id.signup)

        signup.setOnClickListener {

            var name1 = textname.text.toString()
            var email1 = textemail.text.toString()
            var phone1 = textphone.text.toString()
            var gender1 = textgender.text.toString()


            if(emailValidation(textemail)&&phoneVerification(textphone.toString())){
                var user =UsermModel(name1,email1,phone1,gender1)
                var intent = Intent(this, MainActivity1::class.java)
                intent.putExtra("UsermModel", user)
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


