package Model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.modeluser.R
import com.example.modeluser.UserModel

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textViewEmail=findViewById<TextView>(R.id.EmailTextView)
        var textViewName=findViewById<TextView>(R.id.NameTextView)
        var textViewPhone=findViewById<TextView>(R.id.PhoneTextView)
        var textViewGender=findViewById<TextView>(R.id.textViewGender)

        var intent= intent
        var user: UserModel?=intent.getSerializableExtra("user") as UserModel?

        if (user!=null){
            textViewEmail.text=user.email.toString()
            textViewName.text=user.name.toString()
            textViewPhone.text=user.phone.toString()
            textViewGender.text=user.gender.toString()
        }
    }
}