package com.example.viva2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn1=findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
         Intent(applicationContext,MainActivity2::class.java).apply {
             startActivity(this)
             finish()
         }
        }
    }
}