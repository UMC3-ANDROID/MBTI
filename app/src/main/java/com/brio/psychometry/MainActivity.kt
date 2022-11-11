package com.brio.psychometry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brio.psychometry.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private var m1Binding : ActivityMainBinding? =null
    private val binding get() = m1Binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        m1Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startBtn.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


    }



}