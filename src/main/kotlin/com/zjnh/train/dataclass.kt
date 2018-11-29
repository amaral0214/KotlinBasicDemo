package com.zjnh.train


@com.zjnh.train.annotations.Poko
data class Country(val id: Int, val name: String)

fun main(args: Array<String>) {
//    println(Country(1, "China"))
//    val x = addN andThen multiplyN
//    println((addN andThen multiplyN).invoke(1, 2, 3))
    ::log.curried()("Jacky")("Hello!")
}

val addN = fun(i: Int, n: Int): Int {
    return i + n
}

val multiplyN = { i: Int, n: Int -> i * n }

infix fun <P1, P2, P3, P4, P5> Function2<P1, P2, P3>.andThen(function: Function2<P3, P4, P5>): Function3<P1, P2, P4, P5> {
    return fun(p1: P1, p2: P2, p4: P4): P5 {
        return function.invoke(this.invoke(p1, p2), p4)
    }
}


fun <P1, P2, P3> Function2<P1, P2, P3>.curried() =
        fun(p1: P1) = fun(p2: P2) = this(p1, p2)
fun log(tag:String, message:Any?){
    System.out.println("$tag + $message")
}
