package com.example.a100irregularverbs.UI.mainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.a100irregularverbs.R

class MainActivity : AppCompatActivity() {

    //https://youtu.be/LRhu6oRWMjk
    var mainPresentor:MainPresentor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresentor = MainPresentor(this)

    }

    fun btn_start_click(v:View){
        mainPresentor?.btn_click()
    }



}
