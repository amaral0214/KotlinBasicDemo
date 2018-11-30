package com.zjnh.kotlin.collections

fun main(args: Array<String>) {
    val arrayList = ArrayList<String>()
    arrayList.add("Hello")
    arrayList.add("World")
    arrayList.add("!")
    arrayList.removeAt(0)
    arrayList.forEach(::println)

    val list= listOf("Hello","World","!")
    val map= mapOf("key" to "value","2" to "whatever")

}

object Test{
    val list= listOf(1,2,4)
}