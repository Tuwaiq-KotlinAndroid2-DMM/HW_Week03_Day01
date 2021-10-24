package com.alidevs.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}

	fun signUpButtonPressed(view: View) {
		val intent = Intent(this, UserActivity::class.java)

		val name = findViewById<EditText>(R.id.nameEditText).text.toString()
		val email = findViewById<EditText>(R.id.emailEditText).text.toString()
		val phone = findViewById<EditText>(R.id.phoneEditText).text.toString()
		val gender = findViewById<EditText>(R.id.genderEditText).text.toString()

		if (!isValidEmail(email)) {
			Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show()
			return
		}

		if (!isValidPhoneNumber(phone)) {
			Toast.makeText(this, "Please enter a valid phone number", Toast.LENGTH_SHORT).show()
			return
		}

		val user = User(name, email, phone, gender)


		intent.putExtra("user", user)
		startActivity(intent)
	}

	fun isValidEmail(email: String): Boolean = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
	fun isValidPhoneNumber(phoneNumber: String): Boolean = phoneNumber.isNotEmpty() && Patterns.PHONE.matcher(phoneNumber).matches()

}