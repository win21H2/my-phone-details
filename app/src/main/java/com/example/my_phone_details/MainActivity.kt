package com.example.my_phone_details

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = this.resources.getColor(R.color.main_background)
        window.navigationBarColor = this.resources.getColor(R.color.main_background)

        val hardwarePage: Button = findViewById(R.id.hardware)
        hardwarePage.setOnClickListener {
            hardwarePage()
        }

        val softwarePage: Button = findViewById(R.id.software)
        softwarePage.setOnClickListener {
            softwarePage()
        }

        val networkPage: Button = findViewById(R.id.network)
        networkPage.setOnClickListener {
            networkPage()
        }

        val othersPage: Button = findViewById(R.id.others)
        othersPage.setOnClickListener {
            othersPage()
        }

        val aboutPage: Button = findViewById(R.id.about)
        aboutPage.setOnClickListener {
            aboutPage()
        }
    }

    private fun hardwarePage() {
        val intent = Intent(this, hardwarePage::class.java); startActivity(intent)
    }
    private fun softwarePage() {
        val intent = Intent(this, softwarePage::class.java); startActivity(intent)
    }
    private fun networkPage() {
        val intent = Intent(this, networkPage::class.java); startActivity(intent)
    }
    private fun othersPage() {
        val intent = Intent(this, othersPage::class.java); startActivity(intent)
    }
    private fun aboutPage() {
        val intent = Intent(this, aboutPage::class.java); startActivity(intent)
    }
}
// Toast.makeText(this, "hardwarePage", Toast.LENGTH_SHORT).show()