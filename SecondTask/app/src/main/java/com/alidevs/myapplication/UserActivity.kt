package com.alidevs.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class UserActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_user)

		val user = intent.getSerializableExtra("user") as User

		val nameTextView = findViewById<TextView>(R.id.nameEditText)
		val emailTextView = findViewById<TextView>(R.id.emailTextView)
		val phoneTextView = findViewById<TextView>(R.id.phoneTextView)
		val genderTextView = findViewById<TextView>(R.id.genderTextView)

		nameTextView.text = user.name
		emailTextView.text = user.email
		phoneTextView.text = user.phone
		genderTextView.text = user.gender
	}
}