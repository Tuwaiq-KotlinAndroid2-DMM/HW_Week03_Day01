package com.twq.hwovaldation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.twq.hwovaldation.userModel.UserModel

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewNameResult = findViewById<TextView>(R.id.textViewNameResult)
        var textViewEmailResult = findViewById<TextView>(R.id.textViewEmailResult)
        var textViewPhoneResult = findViewById<TextView>(R.id.textViewPhoneResult)
        var textViewGenderResult = findViewById<TextView>(R.id.textViewGenderResult)

        var user:UserModel? = intent.getSerializableExtra("user") as UserModel

            var name = user?.name
            var email = user?.email
            var phone = user?.phone
            var gender = user?.gender

        if (user != null) {
            textViewNameResult.text = name
            textViewEmailResult.text = email
            textViewPhoneResult.text = "+966"+phone
            textViewGenderResult.text = gender
        }
    }
}