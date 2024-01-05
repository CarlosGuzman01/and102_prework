package com.example.and102prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonView)


        button.setOnClickListener {
            Log.v("button clicked", "hello world")
            Toast.makeText(this, "Hello :3", Toast.LENGTH_LONG).show()
        }


    }
}