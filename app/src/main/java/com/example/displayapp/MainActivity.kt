package com.example.displayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Toast.makeText(this,"Sent", Toast.LENGTH_SHORT).show()
            val inputText=input.editableText.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("input",inputText)
            startActivity(intent)

        }
    }
}