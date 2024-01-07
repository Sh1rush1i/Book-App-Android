package com.example.riansyahsetiawan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Book6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book6)
        var actionBar = getSupportActionBar()

        if (actionBar != null) {
            actionBar.title= "Book Detail"
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setDisplayShowHomeEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        return true
    }
}