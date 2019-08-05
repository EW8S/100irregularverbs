package com.example.a100irregularverbs.UI.workActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.a100irregularverbs.R
import kotlinx.android.synthetic.main.activity_work.*

class WorkActivity : AppCompatActivity(), IWorkActivity, View.OnClickListener {

    var workPresenter:WorkPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work)

        workPresenter = WorkPresenter(this, this)

        btn_check_v1.setOnClickListener(this)
        btn_check_v2.setOnClickListener(this)
        btn_check_v3.setOnClickListener(this)
        btn_hepl_v1.setOnClickListener(this)
        btn_hepl_v2.setOnClickListener(this)
        btn_hepl_v3.setOnClickListener(this)
        btn_sound_v1.setOnClickListener(this)
        btn_sound_v2.setOnClickListener(this)
        btn_sound_v3.setOnClickListener(this)
        btn_next_task.setOnClickListener(this)
    }

    //Кнопки
    override fun onClick(p0: View?) {
        workPresenter?.pressAnyButton(p0)
    }

    override fun onBackPressed() {
        workPresenter?.showDefault()
        super.onBackPressed()
    }

    override fun onResume() {
        super.onResume()
        if(tv_task.text.equals(resources.getString(R.string.text_tv_task)))
            workPresenter?.getTask()
    }

    //Проверка

    //Демонстрация ошибки

    //Убрать ошибку

    //Помощь

    //Видимость

    //Цвета

}
