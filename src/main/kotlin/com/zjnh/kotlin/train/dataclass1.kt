package com.zjnh.kotlin.train

import com.zjnh.kotlin.train.annotations.Poko

@Poko
data class Country1(val id: Int, val name: String)

fun main(args: Array<String>) {
//    Country1()
    println(Country(1, "China"))
}

//class China():Country1(){
//
//}