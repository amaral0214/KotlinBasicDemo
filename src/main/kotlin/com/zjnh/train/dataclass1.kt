package com.zjnh.train

import com.zjnh.train.annotations.Poko

@Poko
data class Country1(val id: Int, val name: String)

fun main(args: Array<String>) {
//    Country1()
    println(Country(1, "China"))
}

//class China():Country1(){
//
//}