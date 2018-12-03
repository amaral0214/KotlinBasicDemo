package com.zjnh.kotlin.io

import java.io.File

fun main(args: Array<String>) {
    File("build.gradle.kts").readLines().forEach(::println)
}