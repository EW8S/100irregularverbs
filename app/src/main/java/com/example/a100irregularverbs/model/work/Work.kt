package com.example.a100irregularverbs.model.work

import android.content.Context
import com.example.a100irregularverbs.model.pojo.TaskObject
import com.example.a100irregularverbs.model.repository.ReadJsonFromAssets

class Work {

    var readJsonFromAssets: ReadJsonFromAssets
    var context: Context
    var listTask: TaskObject? = null
    var selectPositionTask:Int = -1

    constructor(context: Context) {
        this.context = context
        readJsonFromAssets = ReadJsonFromAssets(context)
    }

    fun getListTask() {
        listTask = readJsonFromAssets.getTaskObject()
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