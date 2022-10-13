package com.example.my_phone_details

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class hardwarePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hardware_page)
        window.statusBarColor = this.resources.getColor(R.color.main_background)
        window.navigationBarColor = this.resources.getColor(R.color.main_background)

        val home: Button = findViewById(R.id.home)
        home.setOnClickListener { finish() }

        val BOARD: TextView = findViewById(R.id.BOARD)
        BOARD.setText(Build.BOARD).toString()
    }
}