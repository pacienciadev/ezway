package br.com.ezway.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {
  private val createNewAccountBtn: Button by lazy { findViewById(R.id.create_new_account) }
  private val backBtn: Button by lazy { findViewById(R.id.turn_back_btn) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_register)

    val firebaseAuth = Firebase.auth

    createNewAccountBtn.setOnClickListener {
//      createNewUser(firebaseAuth)
    }

    backBtn.setOnClickListener {
      finish()
    }
  }
}
