package com.example.xaubot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvPrice: TextView = findViewById(R.id.tvPrice)
        val btnStart: Button = findViewById(R.id.btnStartBot)
        val btnStop: Button = findViewById(R.id.btnStopBot)
        val btnSettings: Button = findViewById(R.id.btnSettings)

        btnSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        btnStart.setOnClickListener {
            tvPrice.text = "Bot Started..."
        }

        btnStop.setOnClickListener {
            tvPrice.text = "Bot Stopped."
        }
    }
}
