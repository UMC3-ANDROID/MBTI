package com.example.testapplication

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

val TAG: String = "로그"

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setStatusBarTransparent() //status bar transparent



//        /** Called when the user taps the Send button */
//        fun ClickButton(view: View) {
//            // Do something in response to button
//        }
//        //버튼 클릭시 액티비티 전환
//        val start_btn = findViewById<View>(R.id.btn1) as Button
//        start_btn.setOnClickListener {
//            val intent = Intent(applicationContext, ::class.java)
//            startActivity(intent)
//        }

//        openButton.setOnClickListener {
//            val intent = Intent(this, NewActivit2y::class.java)
//            startActivity(intent)


    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity - onPause() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity - onResume() called")
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
    }

    //버튼을 누를 때 호출
    fun onClick(view: View) {
        val intent = Intent(this, Test_1::class.java)
        startActivity(intent)
        //fade in, fade out
        overridePendingTransition(R.anim.fadein, R.anim.fadeout)
        Log.d(TAG, "MainActivity - onClick() called")
    }

    //status bar transparent
    fun MainActivity.setStatusBarTransparent() {
        window.apply {
            setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }
        if(Build.VERSION.SDK_INT >= 30) {	// API 30 에 적용
            WindowCompat.setDecorFitsSystemWindows(window, false)
        }
    }

//https://gogigood.tistory.com/20 status bar 설정관련 참고

}