package com.example.a100irregularverbs.model.pojo

class JsonArrayTask {

    var list: List<String>? = null

    constructor() : super() {}

    constructor(list: List<String>) : super() {
        this.list = list
    }

}