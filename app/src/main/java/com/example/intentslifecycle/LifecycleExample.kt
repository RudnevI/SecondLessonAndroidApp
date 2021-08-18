package com.example.intentslifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LifecycleExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_example)

        println("Create")
    }

    override fun onStart() {
        super.onStart()
        println("Start")
    }

    override fun onResume() {
        super.onResume()
        println("Resume")
    }

    override fun onPause() {
        super.onPause()
        println("Pause")
    }

    override fun onStop() {
        super.onStop()
        println("Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Destroy")
    }
}