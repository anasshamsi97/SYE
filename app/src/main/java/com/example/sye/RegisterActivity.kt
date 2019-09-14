package com.example.sye

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class RegisterActivity : AppCompatActivity() {

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        val register = findViewById<Button>(R.id.register)
        register.setOnClickListener {
            val snackbar = Snackbar.make(findViewById(android.R.id.content), "Registered", Snackbar.LENGTH_SHORT)
            val snackBarView = snackbar.view
            snackBarView.setBackgroundColor(getColor(android.R.color.holo_green_light))
            snackbar.show()
        }
    }
}
