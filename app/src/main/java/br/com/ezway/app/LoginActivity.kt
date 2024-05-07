package br.com.ezway.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private val newAccountBtn: Button by lazy { findViewById(R.id.new_account_btn) }
    private val forgotPasswordBtn: Button by lazy { findViewById(R.id.forgot_password_btn) }
    private val logInBtn: Button by lazy { findViewById(R.id.btn_sign_in) }
    private val signGoogleBtn: Button by lazy { findViewById(R.id.btn_sign_in_google) }
    private val signFacebookBtn: Button by lazy { findViewById(R.id.btn_sign_in_facebook) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        newAccountBtn.setOnClickListener {
            registerAccess()
        }

        forgotPasswordBtn.setOnClickListener {
            forgotPasswordAccess()
        }

        logInBtn.setOnClickListener {
            mainAccess()
        }

        signGoogleBtn.setOnClickListener {
            Toast.makeText(
                this,
                "Acesso com a conta do Google encontra-se em desenvolvimento",
                Toast.LENGTH_SHORT
            ).show()
        }

        signFacebookBtn.setOnClickListener {
            Toast.makeText(
                this,
                "Acesso com a conta do Facebook encontra-se em desenvolvimento",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun registerAccess() {
        val registerIntent = Intent(this, RegisterActivity::class.java)
        startActivity(registerIntent)
    }

    private fun forgotPasswordAccess() {
        val forgotPasswordIntent = Intent(this, ForgotPasswordActivity::class.java)
        startActivity(forgotPasswordIntent)
    }

    private fun mainAccess() {
        val mainIntent = Intent(this, MainActivity::class.java)
        startActivity(mainIntent)
    }
}