package com.zjnh.train

val range: IntRange = 0..1024

fun main(args: Array<String>) {
    println("<top>.main")
    val salary: Int = 1000
    println("$$salary")

    val rawString: String = """
        \t
        \n
        $ salary
    """.trimIndent()
    println(rawString)

    val array = arrayOf("1", "3", "5")
    println(array.joinToString())
    println(array.slice(1..2))
    array.forEach(::println)

    val sum1 = { arg1: Int, arg2: Int ->
        arg1 + arg2
    }
    println(sum(1, 3))
    println(sum1.invoke(1, 3))

}


fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}