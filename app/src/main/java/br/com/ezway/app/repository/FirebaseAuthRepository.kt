package br.com.ezway.app.repository

import android.util.Log
import com.google.firebase.auth.FirebaseAuth

class FirebaseAuthRepository(private val firebaseAuth: FirebaseAuth) {
  private val TAG = "taskCreateUserWithEmailAndPassword"

  fun signupUser(email: String, password: String) {
    val taskCreateUserWithEmailAndPassword =
      firebaseAuth.createUserWithEmailAndPassword(email, password)

    taskCreateUserWithEmailAndPassword.addOnSuccessListener {
      Log.i(TAG, "Usuário Criado")
    }

    taskCreateUserWithEmailAndPassword.addOnFailureListener {
      Log.i(TAG, "${it.message}")
    }
  }

  fun checkUserState(): Boolean {
    val currentUser = firebaseAuth.currentUser

    return currentUser != null
  }


}