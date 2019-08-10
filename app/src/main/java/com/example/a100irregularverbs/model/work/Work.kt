package com.example.a100irregularverbs.model.work

import android.content.Context
import android.content.Intent
import com.example.a100irregularverbs.UI.mainActivity.IMainActivity
import com.example.a100irregularverbs.UI.workActivity.IWorkActivity
import com.example.a100irregularverbs.UI.workActivity.WorkActivity
import com.example.a100irregularverbs.model.pojo.TaskObject
import com.example.a100irregularverbs.model.repository.ReadJsonFromAssets

class Work {

    var readJsonFromAssets: ReadJsonFromAssets
    var context: Context
    var listTask: TaskObject? = null
    var selectPositionTask: Int = -1    //Задается из MainActivity
    private var begin:Int = 0   //Используется в WorkActivity, задает точку смещения в коллекции при выводе тасков
    private var size:Int = 0    //Используется в WorkActivity, задает количество вопросов из коллекции при выводе тасков
    private var countTask:Int = 0    //Используется в WorkActivity, счетчик тасков при последовательно вызове (без Random)

    var mainActivityCallback: IMainActivity? = null
    var workActivityCallback: IWorkActivity? = null

    constructor(context: Context) {
        this.context = context
        readJsonFromAssets = ReadJsonFromAssets(context)
    }

    //Получение объекта со списком задач из GSON
    fun getListTask() {
        listTask = readJsonFromAssets.getTaskObject()
    }

    fun setMainCallback(callback: IMainActivity) {
        mainActivityCallback = callback
    }

    fun setWorkCallback(callback: IWorkActivity) {
        workActivityCallback = callback
    }

    fun startWorkActivity(pos:Int){
        selectPositionTask = pos
        countTask = 0
        val intent = Intent(context, WorkActivity::class.java)
        context.startActivity(intent)
    }

    fun getTask(){

        var diapazon = when(selectPositionTask){
            0, 1, 2, 3 -> Pair(20*selectPositionTask, 20)
            4 -> Pair(20*selectPositionTask, 25)
            else -> { // Note the block
                Pair(0, 105)
            }
        }

        //Засылаем в презентор таск
        workActivityCallback?.showNewTask(listTask!!.list[diapazon.first+countTask])
        if(countTask < diapazon.second) countTask++
        else countTask = 0


        println("EW8S begin=$begin and size=$size")
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