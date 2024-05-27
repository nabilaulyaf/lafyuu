package com.example.lafyuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun loginAccount(view: View) {
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}