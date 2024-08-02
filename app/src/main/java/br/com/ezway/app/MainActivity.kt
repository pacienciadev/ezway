package br.com.ezway.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
  private val nextBtn: Button by lazy { findViewById<Button>(R.id.next_btn) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val firebaseAuth = Firebase.auth

//    checkUserState(firebaseAuth)

    nextBtn.setOnClickListener {
      loginAccess()
    }
  }

  private fun checkUserState(firebaseAuth: FirebaseAuth) {
    val currentUser = firebaseAuth.currentUser

    if (currentUser != null) {
      return dashboardAccess()
    }
  }

  private fun loginAccess() {
    val loginIntent = Intent(this, LoginActivity::class.java)
    startActivity(loginIntent)
  }

  private fun dashboardAccess() {
    val dashboardIntent = Intent(this, DashboardActivity::class.java)
    startActivity(dashboardIntent)
  }
}

