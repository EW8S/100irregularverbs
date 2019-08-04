package com.example.a100irregularverbs.model.work

import android.content.Context
import com.example.a100irregularverbs.model.repository.ReadJsonFromAssets

class Work {

    var readJsonFromAssets:ReadJsonFromAssets
    var context:Context

    constructor(context: Context){
        this.context = context
        readJsonFromAssets = ReadJsonFromAssets(context)
    }

    fun getListTask(){
        readJsonFromAssets.readJson()
    }


    companion object Factory{
       @Volatile private var INSTANCE: Work? = null

        fun getInstance(context: Context) : Work {
            if(INSTANCE == null) {
                INSTANCE = Work(context)
            }
            return INSTANCE!!
        }
    }
//
//    @Volatile private var INSTANCE: Work? = null
//
//    fun getInstance(context: Context): Work =
//        INSTANCE ?: synchronized(this) {
//            INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
//        }
}