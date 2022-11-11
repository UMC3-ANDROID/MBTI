package com.example.figma

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    val TAG: String = "로그"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_second)


        yes1_btn.setOnClickListener(View.OnClickListener {

            onYes1ButtonClicked()

        })

        no1_btn.setOnClickListener(View.OnClickListener {
            onNo1ButtonClicked()
        })

    }


        fun onYes1ButtonClicked(){
            Log.d(TAG, "SecondActivity - onYes1ButtonClicked() called")

            val intent = Intent(this, ThirdActivity::class.java)

            startActivity(intent)


        }


        fun onNo1ButtonClicked(){
            Log.d(TAG, "SecondActivity - onNo1ButtonClicked() called")

            val intent = Intent(this, ThirdActivity::class.java)

            startActivity(intent)
        }
}


