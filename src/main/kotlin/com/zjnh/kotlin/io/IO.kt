package com.zjnh.kotlin.io

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(args: Array<String>) {
    val file = File("build.gradle.kts")
    val bufferedReader = BufferedReader(FileReader(file))
    var line: String
    while (true) {
        line = bufferedReader.readLine() ?: break
        println(line)
    }
    bufferedReader.close()
}