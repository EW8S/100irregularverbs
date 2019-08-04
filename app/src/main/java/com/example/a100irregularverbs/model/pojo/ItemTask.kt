package com.example.a100irregularverbs.model.pojo

class ItemTask {
    var ru: String? = null
    var v1: String? = null
    var v2: String? = null
    var v3: String? = null

    constructor() : super() {}

    constructor(ru: String, v1: String, v2: String, v3: String) : super() {
        this.ru = ru
        this.v1 = v1
        this.v2 = v2
        this.v3 = v3
    }
}