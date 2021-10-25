package com.example.myapplicationhomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var first=findViewById<EditText>(R.id.editTextTextPersonName)
        var second=findViewById<EditText>(R.id.editTextTextPersonName2)
        var buttonAdd=findViewById<Button>(R.id.buttonAdd)

        buttonAdd.setOnClickListener{
            var first =first.text.toString()
            var second=second.text.toString()
            var sum=first+second
            var i=Intent(this,MainActivity2::class.java)
            i.putExtra("sum",sum)
            startActivity(i)
        }

    }
}
