package br.com.ezway.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private val newAccountBtn: Button by lazy { findViewById(R.id.newAccount) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        newAccountBtn.setOnClickListener {
            registerAccess()
        }
    }

//    fun mapAccess() {
//        val mapIntent = Intent(this, MapsActivity::class.java)
//        startActivity(mapIntent)
//    }

    private fun registerAccess() {
        val registerIntent = Intent(this, RegisterActivity::class.java)
        startActivity(registerIntent)
    }



//    fun forgotPasswordAccess() {
//        val forgotPasswordIntent = Intent(this, ForgotPasswordActivity::class.java)
//        startActivity(forgotPasswordIntent)
//    }

//    fun login() {
//    }


}