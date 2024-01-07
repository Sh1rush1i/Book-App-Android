package com.example.riansyahsetiawan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        btnLogin.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Login successfully", Toast.LENGTH_SHORT).show()
        }
        btnRegister.setOnClickListener(){
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}