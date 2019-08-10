package com.example.a100irregularverbs.UI.workActivity

import android.content.Context
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.a100irregularverbs.R
import com.example.a100irregularverbs.model.pojo.ItemTask
import com.example.a100irregularverbs.model.work.Work
import kotlinx.android.synthetic.main.activity_work.*
import kotlinx.android.synthetic.main.activity_work.view.*
import kotlinx.android.synthetic.main.activity_work.view.ed_enter_v1

class WorkPresenter(context: Context, callback: IWorkActivity):IWorkActivity {

    private val context: Context
    private val callback: IWorkActivity
    private var work: Work
    private var workActivity:WorkActivity


    init {
        this.context = context
        this.workActivity = context as WorkActivity
        this.callback = callback
        work = Work.getInstance(context)
        work.setWorkCallback(this)
        work.getTask()
    }

    fun comparateField(p0:EditText, p1:TextView):Boolean{
        if(p0.text.toString().toUpperCase().equals(
                p1.text.toString().toUpperCase()
            )){
            p0.setTextAppearance(R.style.edit_ok)
            p1.visibility=View.GONE
            return true
        }else{
            p0.setTextAppearance(R.style.edit_error)
            p1.visibility=View.VISIBLE
            p1.setTextAppearance(R.style.help)
            return false
        }
    }

    fun help(p0:TextView){
        p0.visibility = View.VISIBLE
        p0.setTextAppearance(R.style.help)
    }

    fun next(){
        if(comparateField(workActivity.ed_enter_v1, workActivity.tv_help_1) &&
            comparateField(workActivity.ed_enter_v2, workActivity.tv_help_2) &&
                comparateField(workActivity.ed_enter_v3, workActivity.tv_help_3)){
                    work.getTask()
        }
    }

    //Обработка нажатия кнопки, смотри WorkActivity
    fun pressAnyButton(v: View?){

        when(v!!.id){
            R.id.btn_check_v1->{
                comparateField(workActivity.ed_enter_v1, workActivity.tv_help_1)
                println("Кликнули на кнопку C для V1")
            }

            R.id.btn_check_v2->{
                comparateField(workActivity.ed_enter_v2, workActivity.tv_help_2)
                println("Кликнули на кнопку C для V2")
            }

            R.id.btn_check_v3->{
                comparateField(workActivity.ed_enter_v3, workActivity.tv_help_3)
                println("Кликнули на кнопку C для V3")
            }

            R.id.btn_hepl_v1->{
                help(workActivity.tv_help_1)
            }

            R.id.btn_hepl_v2->{
                help(workActivity.tv_help_2)
            }

            R.id.btn_hepl_v3->{
                help(workActivity.tv_help_3)
            }

            R.id.btn_sound_v1->{

            }

            R.id.btn_sound_v2->{

            }

            R.id.btn_sound_v3->{

            }
            R.id.btn_next_task ->{
                next()
            }

            else -> {

            }
        }
        println("Pressed button id ${v?.id}")
    }

    fun showDefault(){

    }

    override fun showNewTask(taskItem: ItemTask) {
        callback.showNewTask(taskItem)
    }
}