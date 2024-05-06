package br.com.ezway.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mapAccess() {
        val mapIntent = Intent(this, MapsActivity::class.java)
        startActivity(mapIntent)
    }
}
