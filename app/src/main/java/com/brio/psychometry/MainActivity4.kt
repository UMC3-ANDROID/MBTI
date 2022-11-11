package com.brio.psychometry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brio.psychometry.databinding.ActivityMain2Binding
import com.brio.psychometry.databinding.ActivityMain4Binding
import com.brio.psychometry.databinding.ActivityMainBinding

class MainActivity4 : AppCompatActivity() {
    private var mBinding : ActivityMain4Binding? =null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.answer31.setOnClickListener{
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }

        binding.answer32.setOnClickListener{
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }





    }
}