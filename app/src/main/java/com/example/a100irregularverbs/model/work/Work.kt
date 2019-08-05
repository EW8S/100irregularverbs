package com.example.a100irregularverbs.model.work

import android.content.Context
import com.example.a100irregularverbs.UI.mainActivity.IMainActivity
import com.example.a100irregularverbs.UI.workActivity.IWorkActivity
import com.example.a100irregularverbs.model.pojo.TaskObject
import com.example.a100irregularverbs.model.repository.ReadJsonFromAssets

class Work {

    var readJsonFromAssets: ReadJsonFromAssets
    var context: Context
    var listTask: TaskObject? = null
    var selectPositionTask: Int = -1

    var mainActivityCallback: IMainActivity? = null
    var workActivityCallback: IWorkActivity? = null

    constructor(context: Context) {
        this.context = context
        readJsonFromAssets = ReadJsonFromAssets(context)
    }

    fun getListTask() {
        listTask = readJsonFromAssets.getTaskObject()
    }

    fun setMainCallback(callback: IMainActivity) {
        mainActivityCallback = callback
    }

    fun setWorkCallback(callback: IWorkActivity) {
        workActivityCallback = callback
    }

    companion object Factory {
        @Volatile
        private var INSTANCE: Work? = null

        fun getInstance(context: Context): Work {
            if (INSTANCE == null) {
                INSTANCE = Work(context)
            }
            return INSTANCE!!
        }
    }

}