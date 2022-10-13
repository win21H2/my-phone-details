package com.example.my_phone_details

import android.content.ClipData
import android.content.ClipboardManager
import android.os.BatteryManager
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class hardwarePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hardware_page)
        window.statusBarColor = this.resources.getColor(R.color.main_background)
        window.navigationBarColor = this.resources.getColor(R.color.main_background)

        val home: Button = findViewById(R.id.home)
        home.setOnClickListener { finish() }

        val batteryManager = getSystemService(BATTERY_SERVICE) as BatteryManager

        val info: TextView = findViewById(R.id.INFO)
        val buildInfo = (
                    "BUILD BOARD\n" + Build.BOARD +
                    "\n\nBUILD BRAND\n" + Build.BRAND +
                    "\n\nBUILD MANUFACTURER\n" + Build.MANUFACTURER +
                    "\n\nBUILD MODEL\n" + Build.MODEL +
                    "\n\nBUILD ID\n" + Build.ID +
                    "\n\nBUILD PRODUCT\n" + Build.PRODUCT +
                    "\n\nBUILD HARDWARE\n" + Build.HARDWARE +
                    "\n\nBUILD FINGERPRINT\n" + Build.FINGERPRINT +
                    "\n\nBUILD DEVICE\n" + Build.DEVICE +
                    "\n\nBATTERY SERVICE\n" + batteryManager
                )
        info.setText(buildInfo).toString()

        val copy: Button = findViewById(R.id.copydata)

        copy.setOnClickListener {
            val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("Build Info", Build.BOARD)
            clipboard.setPrimaryClip(clip)
            Toast.makeText(this, "BUILD BOARD Copied to clipboard", Toast.LENGTH_SHORT).show()
        }

        /*Log.i("TAG","MODEL: " + Build.MODEL)
        Log.i("TAG","ID: " + Build.ID)
        Log.i("TAG","Manufacture: " + Build.MANUFACTURER)
        Log.i("TAG","brand: " + Build.BRAND)
        Log.i("TAG","type: " + Build.TYPE)
        Log.i("TAG","user: " + Build.USER)
        Log.i("TAG","BASE: " + Build.VERSION_CODES.BASE)
        Log.i("TAG","INCREMENTAL " + Build.VERSION.INCREMENTAL)

        Log.i("TAG","BOARD: " + Build.BOARD)
        Log.i("TAG","BRAND " + Build.BRAND)
        Log.i("TAG","HOST " + Build.HOST)
        Log.i("TAG","FINGERPRINT: "+Build.FINGERPRINT)
        Log.i("TAG","Version Code: " + Build.VERSION.RELEASE)*/
    }

}