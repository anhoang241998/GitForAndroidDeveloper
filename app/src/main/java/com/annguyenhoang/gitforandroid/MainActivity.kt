package com.annguyenhoang.gitforandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my second commit")
        println("Local change")
        println("Change 4")
        println("This line will be merged")
        println("Hello from your friend")
    }
}