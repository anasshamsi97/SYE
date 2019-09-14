package com.example.sye

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class AskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ask)

        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        val register = findViewById<Button>(R.id.register)
        register.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}
