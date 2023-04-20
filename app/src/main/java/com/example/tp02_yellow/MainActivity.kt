package com.example.tp02_yellow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breakfastBtn = findViewById<Button>(R.id.breakfastBtn)
        breakfastBtn.setOnClickListener{
            val intent = Intent(this, BreakfastActivity::class.java)
            startActivity(intent)
        }

        val lunchBtn = findViewById<Button>(R.id.lunchBtn)
        lunchBtn.setOnClickListener{
            val intent = Intent(this, LunchActivity::class.java)
            startActivity(intent)
        }
        val dinnerBtn = findViewById<Button>(R.id.dinnerBtn)
        dinnerBtn.setOnClickListener{
            val intent = Intent(this, DinnerActivity::class.java)
            startActivity(intent)
        }
    }


}