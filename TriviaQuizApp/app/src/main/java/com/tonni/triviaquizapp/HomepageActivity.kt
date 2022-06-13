package com.tonni.triviaquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomepageActivity : AppCompatActivity() {
    private lateinit var guestButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        guestButton = findViewById(R.id.guestBtnId)

        guestButton.setOnClickListener {
            intent = Intent(this,InputActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}