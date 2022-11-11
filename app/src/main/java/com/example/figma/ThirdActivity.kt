package com.example.figma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_third)


        yes2_btn.setOnClickListener(View.OnClickListener {

            onYes2ButtonClicked()

        })

        no2_btn.setOnClickListener(View.OnClickListener {
            onNo2ButtonClicked()
        })
    }

    fun onYes2ButtonClicked(){
        Log.d(TAG, "ThirdActivity - onYes2ButtonClicked() called")

        val intent = Intent(this, ForthActivity::class.java)

        startActivity(intent)


    }


    fun onNo2ButtonClicked(){
        Log.d(TAG, "ThirdActivity - onNo2ButtonClicked() called")

        val intent = Intent(this, ForthActivity::class.java)

        startActivity(intent)
    }
}