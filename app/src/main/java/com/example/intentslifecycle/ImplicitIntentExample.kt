package com.example.intentslifecycle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import java.io.File

class ImplicitIntentExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent_example)

        /*val button = findViewById<AppCompatButton>(R.id.registerButton)
        button.setOnClickListener {
            val pdfFile= File(Uri.parse("filepath")/)
            val intent = Intent(Intent.ACTION_VIEW, pdfFile.path)
            startActivity(intent)
        }*/
    }
    }