package Model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.modeluser.R
import com.example.modeluser.UserModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailEditText = findViewById<EditText>(R.id.EmailText)
        var nameEditText = findViewById<EditText>(R.id.NameText)
        var PhoneEditText = findViewById<EditText>(R.id.editTextPhone)
        var GenderEditText=findViewById<EditText>(R.id.EditTextGender)
        var BtnGo = findViewById<Button>(R.id.BtnGo)

        BtnGo.setOnClickListener {
            var name = nameEditText.text.toString()
            var email = emailEditText.text.toString()
            var phone = PhoneEditText.text.toString()
            var gender =GenderEditText.text.toString()

            if (EmailValidation(emailEditText) && PhoneValidate(PhoneEditText)){
                var user = UserModel(name,email,phone,gender)
                var intent= Intent(this,MainActivity2::class.java)
                intent.putExtra("user",user)
                startActivity(intent)

            }


        }

    }

    fun EmailValidation(emailEditText: EditText): Boolean {

        var email = emailEditText.text.toString()

        if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

            return true

        } else {
            Toast.makeText(this, "Email is Invalid", Toast.LENGTH_SHORT).show()
            return false

        }
    }

    fun PhoneValidate(phoneEditText: EditText): Boolean {
        var phoneD = phoneEditText.text.toString()
        if (!phoneD.isEmpty() && Patterns.PHONE.matcher(phoneD).matches()) {
            return true

        }else
            return false

    }

}