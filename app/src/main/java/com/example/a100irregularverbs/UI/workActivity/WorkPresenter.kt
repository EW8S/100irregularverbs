package com.example.a100irregularverbs.UI.workActivity

import android.content.Context
import android.view.View
import com.example.a100irregularverbs.model.work.Work

class WorkPresenter(context: Context, callback: IWorkActivity):IWorkActivity {

    val context: Context
    val callback: IWorkActivity
    var work: Work

    init {
        this.context = context
        this.callback = callback
        work = Work.getInstance(context)
        work.setWorkCallback(this)

    }

    fun pressAnyButton(v: View?){
        println("Pressed button id ${v?.id}")
    }

    fun showDefault(){

    }

    fun getTask(){
        //work.get
    }

}