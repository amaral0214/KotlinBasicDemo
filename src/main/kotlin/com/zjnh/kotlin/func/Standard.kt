package com.zjnh.kotlin.func

fun main(args: Array<String>) {
    val person = Person("benny", 18)
    person.let { ps ->
        ps.name = "George"
        ps.work()
        ps
    }.age = 16

    person.apply {
        age = 17
        work()
    }.age = 19

    with(person) {
        age = 20
        name = "Peppa"
        work()
        this
    }.age = 21

}

class Person(var name: String, var age: Int) {
    fun work() {
        println("$name is working")
    }
}