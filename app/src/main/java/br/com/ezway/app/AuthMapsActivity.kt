package br.com.ezway.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AuthMapsActivity : AppCompatActivity() {
    private val nextBtn: Button by lazy { findViewById<Button>(R.id.next_btn) }
    private val backBtn: Button by lazy { findViewById<Button>(R.id.turn_back_btn) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        backBtn.setOnClickListener {
            finish()
        }

        nextBtn.setOnClickListener {
            dashboardAccess()
        }

    }

    private fun dashboardAccess() {
        val dashboardIntent = Intent(this, DashboardActivity::class.java)
        startActivity(dashboardIntent)
    }

}

