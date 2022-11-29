package com.example.viva2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var anim = AnimationUtils.loadAnimation(applicationContext,R.anim.rotate)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var gnulogo = findViewById<ImageView>(R.id.gnu_logo)


        btn1.setOnClickListener {
            Intent(applicationContext,MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }

        btn2.setOnClickListener {
            gnulogo.startAnimation(anim)
        }
    }
}