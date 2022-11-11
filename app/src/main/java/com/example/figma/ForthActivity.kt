package com.example.figma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_forth.*
import kotlinx.android.synthetic.main.activity_third.*

class ForthActivity : AppCompatActivity() {

    val TAG: String = "로그"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_forth)

        yes3_btn.setOnClickListener(View.OnClickListener {

            onYes3ButtonClicked()

        })

        no3_btn.setOnClickListener(View.OnClickListener {
            onNo3ButtonClicked()
        })
    }
    fun onYes3ButtonClicked(){
        Log.d(TAG, "ForthActivity - onYes3ButtonClicked() called")

        val intent = Intent(this, OutputActivity::class.java)

        startActivity(intent)


    }


    fun onNo3ButtonClicked(){
        Log.d(TAG, "ForthActivity - onNo3ButtonClicked() called")

        val intent = Intent(this, OutputActivity::class.java)

        startActivity(intent)
    }
}