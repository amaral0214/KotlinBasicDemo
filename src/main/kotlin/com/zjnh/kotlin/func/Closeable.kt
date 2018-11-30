package com.zjnh.kotlin.func

import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {
    //读取文件方式一
    val br = BufferedReader(FileReader("hello.txt")) //打开文件读取
    with(br) {
        //对br中的属性和方法直接进行操作
        var line: String?

        while (true) {
            line = readLine() ?: break //读取一行数据，若为空则退出循环
            println(line) //打印读取的数据
        }
        close() //关闭文件读取
    }

    //读取文件方式二
    BufferedReader(FileReader("hello.txt")).use {
        var line: String?

        while (true) {
            line = it.readLine() ?: break //读取一行数据，若为空则退出循环
            println(line) //打印读取的数据
        }
    }

    //读取文件方式三
    println(BufferedReader(FileReader("hello.txt")).readText()) //最简单的读取文件的方法
}