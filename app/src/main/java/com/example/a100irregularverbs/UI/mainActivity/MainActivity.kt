package com.example.a100irregularverbs.UI.mainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.a100irregularverbs.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IMainActivity {

    //https://youtu.be/LRhu6oRWMjk
    var mainPresenter:MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this, this)

    }

    fun btn_start_click(v:View){
        val pos = spinner.selectedItemPosition
        println("MainActivity pos = $pos")
        mainPresenter?.btn_click(pos)
    }

    override fun setSwEnAudio(state:Boolean){
        sw_en_audio.isChecked =state
    }

    override fun setSwEnRandom(state:Boolean){
        sw_en_random.isChecked = state
    }

    override fun setItemInSpinner(pos:Int){
        spinner.setSelection(pos)
    }



}
