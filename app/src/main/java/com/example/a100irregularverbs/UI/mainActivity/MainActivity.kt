package com.example.a100irregularverbs.UI.mainActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.a100irregularverbs.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //https://youtu.be/LRhu6oRWMjk
    val mainPresentor = MainPresentor(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btn_start_click(v:View){
        mainPresentor.btn_click()
    }



}
