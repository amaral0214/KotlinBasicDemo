package com.zjnh.kotlin.sam

import com.zjnh.java.sam.SAMInJava

fun main(args: Array<String>) {
    val samInJava = SAMInJava()
    samInJava.addTask {
        println("Hello")
    }

    val lambda = {
        println("Hello in lambda")
    }

    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)

    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)

    val samInKotlin = SAMinKotlin()
//    samInKotlin.addTask(Runnable {
//        println("")
//    })

    //添加typealias后
    samInKotlin.addTask {
        println("")
    }
}
