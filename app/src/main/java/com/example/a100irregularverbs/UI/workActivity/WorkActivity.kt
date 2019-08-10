package com.example.a100irregularverbs.UI.workActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.a100irregularverbs.R
import com.example.a100irregularverbs.model.pojo.ItemTask
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
//        if(tv_task.text.equals(resources.getString(R.string.text_tv_task)))
//            workPresenter?.getTask()
    }

    override fun showNewTask(taskItem: ItemTask) {
        tv_task.text = taskItem.ru
        tv_help_1.text = taskItem.v1
        tv_help_2.text = taskItem.v2
        tv_help_3.text = taskItem.v3

        tv_help_1.visibility = View.GONE
        tv_help_2.visibility = View.GONE
        tv_help_3.visibility = View.GONE

        ed_enter_v1.setText("")
        ed_enter_v2.setText("")
        ed_enter_v3.setText("")

        ed_enter_v1.setTextAppearance(R.style.edit_default)
        ed_enter_v2.setTextAppearance(R.style.edit_default)
        ed_enter_v3.setTextAppearance(R.style.edit_default)

        ed_enter_v1.setFocusableInTouchMode(true)
        ed_enter_v1.requestFocus()

    }
//Проверка

    //Демонстрация ошибки

    //Убрать ошибку

    //Помощь

    //Видимость

    //Цвета

}
