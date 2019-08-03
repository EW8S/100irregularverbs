package com.example.a100irregularverbs.UI.mainActivity

import android.content.Context
import android.content.Intent
import com.example.a100irregularverbs.UI.workActivity.WorkActivity

class MainPresentor(context:Context) {

    val context:Context

    init {
        this.context = context
    }

    fun btn_click(){
        val intent = Intent(context, WorkActivity::class.java)
        context.startActivity(intent)
    }
}