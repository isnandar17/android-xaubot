package com.example.xaubot

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val etBaseUrl: EditText = findViewById(R.id.etBaseUrl)
        val etApiKey: EditText = findViewById(R.id.etApiKey)
        val btnSave: Button = findViewById(R.id.btnSaveSettings)

        btnSave.setOnClickListener {
            Toast.makeText(this, "Settings saved!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
