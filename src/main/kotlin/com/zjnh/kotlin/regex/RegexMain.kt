package com.zjnh.kotlin.regex

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.util.regex.Pattern

fun main(args: Array<String>) {
    val source = "Hello, this is my phone number: 010-12345678."
    BufferedReader(FileReader("hello.txt")).use {
        var line: String?

        while (true) {
            line = it.readLine() ?: break //读取一行数据，若为空则退出循环
            println(line) //打印读取的数据
        }
    }

    val pattern = ".*(\\d{3}-\\d{8}).*"
    val matcher = Pattern.compile(pattern).matcher(source)

    while (matcher.find()) {
        println(matcher.group())
        println(matcher.group(1))
    }
}