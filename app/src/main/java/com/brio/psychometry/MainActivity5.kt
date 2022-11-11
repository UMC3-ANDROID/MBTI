package com.brio.psychometry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brio.psychometry.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private var m2Binding : ActivityMain5Binding? =null
    private val binding get() = m2Binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        m2Binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.HOME.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }






    }
}