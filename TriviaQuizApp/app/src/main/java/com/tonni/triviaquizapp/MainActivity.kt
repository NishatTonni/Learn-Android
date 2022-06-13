package com.tonni.triviaquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var playButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton = findViewById(R.id.playBtnId)

        playButton.setOnClickListener {
            intent = Intent(this,QuestionActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}