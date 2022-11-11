package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast


class Test_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)

    }

    fun onClick(view:View) {
        val intent = Intent(this, Test_3::class.java)
        startActivity(intent)
        //fade in, fade out
        overridePendingTransition(R.anim.fadein, R.anim.fadeout)

//        when(view?.id){
//
//            R.id.yes1 ->{
//                val myToast = Toast.makeText(this.applicationContext, "yes2", Toast.LENGTH_SHORT)
//                myToast.show()}
//
//            R.id.no1 -> {val myToast = Toast.makeText(this.applicationContext, "no2", Toast.LENGTH_SHORT)
//                myToast.show()}
//        }
    }

//    fun onClick(view: View) {
//
//        val intent = Intent(this, Test_3::class.java)
//        startActivity(intent)
//        //fade in, fade out
//        overridePendingTransition(R.anim.fadein, R.anim.fadeout)
//    }
}