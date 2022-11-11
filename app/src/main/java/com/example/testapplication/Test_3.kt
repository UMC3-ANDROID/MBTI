package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Test_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3)
    }

    fun onClick(view: View) {

        val intent = Intent(this, Result_T::class.java)
        startActivity(intent)
        //fade in, fade out
        overridePendingTransition(R.anim.fadein, R.anim.fadeout)
    }
}

//        yes와 no의 결과에 따라 bool값을 부여하고, 그거에 따라서 T f 출력할지를 골라야 할듯

//    fun onClick(view: View) {
//

//        val intent = Intent(this, Result_T::class.java)
//        startActivity(intent)
//        //fade in, fade out
//        overridePendingTransition(R.anim.fadein, R.anim.fadeout)
//
//
//       val intent = Intent(this, Test_3::class.java)
//        startActivity(intent)
//        //fade in, fade out
//        overridePendingTransition(R.anim.fadein, R.anim.fadeout)
//    }
//}