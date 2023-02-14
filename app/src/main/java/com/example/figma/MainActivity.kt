package com.example.figma

import android.content.ContentValues.TAG
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"
    //뷰가 생성되었을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //그릴 xml 뷰s 파일을 연결 시켜준다.
        setContentView(R.layout.activity_main)

        //로그인 버튼 뷰에 클릭 리스너 설정정
       start_btn.setOnClickListener(View.OnClickListener{

           onStartButtonClicked()
        })
    }

    fun onStartButtonClicked() {
       Log.d(TAG, "MainActivity - onStartButtonClicked() called")

        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }
}