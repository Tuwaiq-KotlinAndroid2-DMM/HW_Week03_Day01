package com.twq.hw11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var editTextResult=findViewById<TextView>(R.id.editTextResult)
        var intentResult=intent.getIntExtra("sum",-1)
        editTextResult.text= intentResult.toString()
    }
}