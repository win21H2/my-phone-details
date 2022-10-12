package com.example.my_phone_details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class othersPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_others_page)
        window.statusBarColor = this.resources.getColor(R.color.main_background)
        window.navigationBarColor = this.resources.getColor(R.color.main_background)

        val home: Button = findViewById(R.id.home)
        home.setOnClickListener { finish() }
    }
}