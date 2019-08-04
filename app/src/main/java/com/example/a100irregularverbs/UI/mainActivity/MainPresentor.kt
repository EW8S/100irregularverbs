package com.example.a100irregularverbs.UI.mainActivity

import android.app.Application
import android.content.Context
import android.content.Intent
import com.example.a100irregularverbs.UI.workActivity.WorkActivity
import com.example.a100irregularverbs.model.work.Work

class MainPresentor(context:Context) {

    val context:Context
    var work: Work

    init {
        this.context = context
        work = Work.getInstance(context)
        work.getListTask()
    }

    fun btn_click(){
        val intent = Intent(context, WorkActivity::class.java)
        context.startActivity(intent)
    }


}