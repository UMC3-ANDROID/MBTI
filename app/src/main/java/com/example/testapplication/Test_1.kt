package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


public class Test_1 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState);
        setContentView(com.example.testapplication.R.layout.activity_test1);

            }


    fun onClick(view: View) {

        val intent = Intent(this, Test_2::class.java)
        startActivity(intent)
        //fade in, fade out
        overridePendingTransition(R.anim.fadein, R.anim.fadeout)


        //버튼 yes no에 따라서 bool값 지정해서 결과가 저장 혹은 전달되도록 하기 test
        when(view?.id){

            R.id.yes1 ->{
                val myToast = Toast.makeText(this.applicationContext, "yes", Toast.LENGTH_SHORT)
                myToast.show()}

            R.id.no1 -> {val myToast = Toast.makeText(this.applicationContext, "no", Toast.LENGTH_SHORT)
                myToast.show()}
        }

    }




//    override fun onClick(view: View?){
//        val intent = Intent(this, Test_2::class.java)
//        startActivity(intent)
//        //fade in, fade out
//        overridePendingTransition(com.example.testapplication.R.anim.fadein, com.example.testapplication.R.anim.fadeout)
////        if(view != null){
            //버튼 id에 따라 알림 메시지를 띄움
//            when(view.id){
//            R.id.btn1 -> Toast.makeText.(this, "버튼1", Toast.LENGTH_SHORT).show()
//            }
//        }
    }



//        val developer_info_btn = findViewById<View>(R.id.test1_yes) as Button
//        developer_info_btn.setOnClickListener {
//            val intent = Intent(applicationContext, Test_2::class.java)
//            startActivity(intent)
//        }



