package com.zjnh.train

import java.io.File

fun main(args: Array<String>) {
    val map=HashMap<Char, Int>()
    val listChar=File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace)
    listChar.forEach {
        val count=map[it]
        if(count==null) map[it]=1
        else map[it]=count+1
    }
    map.forEach(::println)

    listChar.asSequence().groupBy { it }.map {
        it.key to it.value.size
    }.toList().forEach(::println)

}