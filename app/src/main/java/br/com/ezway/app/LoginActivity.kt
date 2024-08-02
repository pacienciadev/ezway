package br.com.ezway.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
  private val userLoginTextField: EditText by lazy { findViewById(R.id.inputUsername) }
  private val userPasswordTextField: EditText by lazy { findViewById(R.id.inputPassword) }

  private val newAccountBtn: Button by lazy { findViewById(R.id.new_account_btn) }
  private val forgotPasswordBtn: Button by lazy { findViewById(R.id.forgot_password_btn) }
  private val logInBtn: Button by lazy { findViewById(R.id.btn_sign_in) }
  private val signGoogleBtn: Button by lazy { findViewById(R.id.btn_sign_in_google) }
  private val signFacebookBtn: Button by lazy { findViewById(R.id.btn_sign_in_facebook) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)

    val firebaseAuth = Firebase.auth

    newAccountBtn.setOnClickListener {
      registerAccess()
    }

    forgotPasswordBtn.setOnClickListener {
      forgotPasswordAccess()
    }

    logInBtn.setOnClickListener {
      val userLogin = userLoginTextField.text.toString()
      val userPassword = userPasswordTextField.text.toString()

      userSignIn(firebaseAuth, userLogin, userPassword)
    }

    signGoogleBtn.setOnClickListener {
      Toast.makeText(
        this, "Acesso com a conta do Google encontra-se em desenvolvimento", Toast.LENGTH_SHORT
      ).show()
    }

    signFacebookBtn.setOnClickListener {
      Toast.makeText(
        this, "Acesso com a conta do Facebook encontra-se em desenvolvimento", Toast.LENGTH_SHORT
      ).show()
    }
  }

  private fun userSignIn(
    firebaseAuth: FirebaseAuth,
    userLogin: String,
    userPassword: String
  ) {
    val taskSignInWithEmailAndPassword =
      firebaseAuth.signInWithEmailAndPassword(userLogin, userPassword)

    taskSignInWithEmailAndPassword.addOnSuccessListener {
      Toast.makeText(
        this, "Autenticado com sucesso.", Toast.LENGTH_LONG
      ).show()

      dashboardAccess()
    }

    taskSignInWithEmailAndPassword.addOnFailureListener {
      Toast.makeText(
        this, it.message, Toast.LENGTH_LONG
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

  private fun dashboardAccess() {
    val dashboardIntent = Intent(this, DashboardActivity::class.java)
    startActivity(dashboardIntent)
  }
}