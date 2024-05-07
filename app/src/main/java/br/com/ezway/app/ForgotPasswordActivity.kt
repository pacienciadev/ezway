package br.com.ezway.app

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    private val forgotPasswordRequestBtn: Button by lazy { findViewById(R.id.forgot_password_request_btn) }
    private val backBtn: Button by lazy { findViewById(R.id.turn_back_btn) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        forgotPasswordRequestBtn.setOnClickListener {
            Toast.makeText(this, "Recuperação de senha encontra-se em desenvolvimento", Toast.LENGTH_SHORT).show()
        }

        backBtn.setOnClickListener {
            finish()
        }
    }


}