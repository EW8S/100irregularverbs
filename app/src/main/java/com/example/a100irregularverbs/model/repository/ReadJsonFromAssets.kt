package com.example.a100irregularverbs.model.repository

import android.app.Activity
import android.content.Context
import java.io.IOException
import java.io.InputStream

class ReadJsonFromAssets (context: Context){

    var context: Context

    init {
        this.context = context
    }

    fun readJson(){
        var json: String? = null

        try {
            val inputStream:InputStream = context.assets.open("105.json")
            //val inputStream: InputStream = am.open("105.json")!!
            //json = inputStream.bufferedReader().use { it.readText()}
            json = "dadsad"

        }catch(e : IOException){

        }
    }

//    fun getStringFromAssetFile(): String {
//        val am = context.assets
//        val is = am.open("test.txt")
//        val s = convertStreamToString(`is`)
//        `is`.close()
//        return s
//    }

}