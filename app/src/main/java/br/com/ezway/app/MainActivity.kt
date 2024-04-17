package br.com.ezway.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import br.com.ezway.app.databinding.ActivityMainBinding
import br.com.ezway.app.ui.login.SignInWithEmailAndPasswordActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun signInAccess(view: View) {
        val intent = Intent(this, SignInWithEmailAndPasswordActivity::class.java)
        startActivity(intent)
    }

    fun mapAccess(view: View) {
        val mapIntent = Intent(this, MapsActivity::class.java)
        startActivity(mapIntent)
    }
}
