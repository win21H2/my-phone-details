package com.example.my_phone_details

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class aboutPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)
        window.statusBarColor = this.resources.getColor(R.color.main_background)
        window.navigationBarColor = this.resources.getColor(R.color.main_background)

        val github: Button = findViewById(R.id.GITHUB)
        val linkedin: Button = findViewById(R.id.LINKEDIN)
        val instagram: Button = findViewById(R.id.YOUTUBE)
        val twitter: Button = findViewById(R.id.TWITTER)
        val stackoverflow: Button = findViewById(R.id.STACKOF)
        val gdotdev: Button = findViewById(R.id.GDOTDEV)
        val home: Button = findViewById(R.id.home)

        home.setOnClickListener { finish() }
        github.setOnClickListener { github() }
        linkedin.setOnClickListener { linkedin() }
        instagram.setOnClickListener { youtube() }
        twitter.setOnClickListener { twitter() }
        stackoverflow.setOnClickListener { stackoverflow() }
        gdotdev.setOnClickListener { gdotdev() }
    }

    private fun github() {
        Toast.makeText(this, "Redirecting to https://github.com/win21H2", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/win21H2"))
            startActivity(i)
        }, 1000)
    }
    private fun linkedin() {
        Toast.makeText(this, "Redirecting to https://www.linkedin.com/in/mark-pushisnky/", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/mark-pushisnky/"))
            startActivity(i)
        }, 1000)
    }
    private fun youtube() {
        Toast.makeText(this, "Redirecting to https://www.youtube.com/channel/UCIxhTC2VeyZOCZZvmP-zLDg", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCIxhTC2VeyZOCZZvmP-zLDg"))
            startActivity(i)
        }, 1000)
    }
    private fun twitter() {
        Toast.makeText(this, "Redirecting to https://twitter.com/win21H2", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/win21H2"))
            startActivity(i)
        }, 1000)
    }
    private fun stackoverflow() {
        Toast.makeText(this, "Redirecting to https://stackoverflow.com/users/19235706/324hz", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://stackoverflow.com/users/19235706/324hz"))
            startActivity(i)
        }, 1000)
    }
    private fun gdotdev() {
        Toast.makeText(this, "Redirecting to https://g.dev/324hz", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://g.dev/324hz"))
            startActivity(i)
        }, 1000)
    }
}