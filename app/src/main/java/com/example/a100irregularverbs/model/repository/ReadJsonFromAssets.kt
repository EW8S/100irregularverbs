package com.example.a100irregularverbs.model.repository

import android.content.Context
import com.example.a100irregularverbs.model.pojo.TaskObject
import com.google.gson.Gson
import java.io.InputStream

class ReadJsonFromAssets(context: Context) {

    val context: Context

    init {
        this.context = context
    }

    fun readJson(): String? {
        var json: String? = null

        try {
            var inputStream: InputStream = context.assets.open("105.json")
            json = inputStream.bufferedReader().use { it.readText() }
        } catch (e: Exception) {
            println("Exception readJson >>> " + e.printStackTrace())
        }
        return json
    }

    fun getTaskObject(): TaskObject? {
        val str: String? = readJson()
        var gson = Gson()
        var model: TaskObject? = null

        if (!str.isNullOrEmpty())
            model = gson.fromJson(str, TaskObject::class.java)
        return model
    }


}