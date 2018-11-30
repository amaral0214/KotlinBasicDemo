package com.zjnh.kotlin.train

private const val USERNAME="kotlin"
private const val PASSWORD="jetbrains"

fun main(args: Array<String>) {
//    println("please input user name")
//    val userName= readLine()
//    println("please input password")
//    val passwd= readLine()
//
//    if(userName== USERNAME&&passwd== PASSWORD){
//        println("login success!")
//    }else{
//        println("login fail!")
//    }

    val list= MyIntList()
    list.add(1)
    list.add(2)
    list.add(3)
    for(arg in list){
        println(arg)
    }
}

class MyIterator(var iterator:Iterator<Int>){
    operator fun next():Int{
        return iterator.next()
    }

    operator fun hasNext():Boolean{
        return iterator.hasNext()
    }
}

class YourIterator(var iterator:Iterator<Int>):Iterator<Int>{
    override fun hasNext(): Boolean {
        return iterator.hasNext()
    }

    override fun next(): Int {
        return iterator.next()
    }



}

class MyIntList {
private val list=ArrayList<Int>()
    fun add(int:Int){
        list.add(int)
    }

    fun remove(int:Int){
        list.remove(int)
    }

//    operator fun iterator():MyIterator{
//        return MyIterator(list.iterator())
//    }
    operator fun iterator():Iterator<Int>{
        return list.iterator()
    }

}