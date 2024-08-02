package br.com.ezway.app.viewModels

import br.com.ezway.app.repository.FirebaseAuthRepository

class UserSignupViewModel(private val repository: FirebaseAuthRepository) {
  fun signup(email: String, password: String){
    repository.signupUser(email, password)
  }
}