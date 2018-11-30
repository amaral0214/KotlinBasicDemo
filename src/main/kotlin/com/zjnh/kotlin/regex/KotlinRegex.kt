package com.zjnh.kotlin.regex

fun main(args: Array<String>) {
    val source = "Hello, this is my phone number: 010-12345678."
    val pattern = """.*(\d{3}-\d{8}).*"""   //raw string

    val a=Regex(pattern).findAll(source).toList()
            .flatMap(MatchResult::groupValues)
            .forEach(::println)

}