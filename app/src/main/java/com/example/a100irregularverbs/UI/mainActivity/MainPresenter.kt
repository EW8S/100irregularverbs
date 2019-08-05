package com.example.a100irregularverbs.UI.mainActivity

import android.content.Context
import android.content.Intent
import com.example.a100irregularverbs.UI.workActivity.WorkActivity
import com.example.a100irregularverbs.model.work.Work

class MainPresenter(context: Context, callback: IMainActivity):IMainActivity {

    val context: Context
    val callback: IMainActivity
    var work: Work

    init {
        this.context = context
        this.callback = callback
        work = Work.getInstance(context)
        work.setMainCallback(this)
        work.getListTask()
    }

    fun btn_click(posSpinner:Int) {
        println("MainPresenter pos = $posSpinner")
        work.selectPositionTask = posSpinner
        val intent = Intent(context, WorkActivity::class.java)
        context.startActivity(intent)
    }

    override fun setSwEnAudio(state: Boolean) {
        callback.setSwEnAudio(state)
    }

    override fun setSwEnRandom(state: Boolean) {
        callback.setSwEnRandom(state)
    }

    override fun setItemInSpinner(pos: Int) {
        callback.setItemInSpinner(pos)
    }

}