package com.brio.psychometry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brio.psychometry.databinding.ActivityMain2Binding
import com.brio.psychometry.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private var m2Binding : ActivityMain2Binding? =null
    private val binding get() = m2Binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        m2Binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.answer11.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }

        binding.answer12.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }





    }
}