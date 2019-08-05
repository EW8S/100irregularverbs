package com.example.a100irregularverbs.UI.mainActivity

import android.content.Context
import android.content.Intent
import com.example.a100irregularverbs.UI.workActivity.WorkActivity
import com.example.a100irregularverbs.model.work.Work

class MainPresentor(context: Context, callback: IMainActivity) {

    val context: Context
    val callback: IMainActivity
    var work: Work

    init {
        this.context = context
        this.callback = callback
        work = Work.getInstance(context)
        work.getListTask()
    }

    fun btn_click(posSpinner:Int) {
        println("MainPresenter pos = $posSpinner")
        work.selectPositionTask = posSpinner
        val intent = Intent(context, WorkActivity::class.java)
        context.startActivity(intent)
    }


}