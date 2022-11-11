package com.brio.psychometry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brio.psychometry.databinding.ActivityMain2Binding
import com.brio.psychometry.databinding.ActivityMain3Binding
import com.brio.psychometry.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private var m3Binding : ActivityMain3Binding? =null
    private val binding get() = m3Binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        m3Binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.answer21.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

        binding.answer22.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }





    }
}