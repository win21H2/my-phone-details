package com.example.my_phone_details

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }

    private fun hardwarePage() {
        Toast.makeText(this, "hardwarePage", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, hardwarePage::class.java); startActivity(intent)
    }
    private fun softwarePage() {
        Toast.makeText(this, "softwarePage", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, softwarePage::class.java); startActivity(intent)
    }
}