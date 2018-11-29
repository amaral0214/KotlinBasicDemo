package com.zjnh.train

abstract class Person(open val age: Int) {
    abstract val gender: Int
    abstract fun work()
}

open class Programmer(final override val age: Int, override val gender: Int) : Person(age) {

    override fun work() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class JavaProgrammer(age: Int, override val gender: Int) : Programmer(age, gender) {

    override fun work() {
        super.work()
        println("")
    }
}

open class Teacher : Person {
    override val age: Int
    override val gender: Int

    constructor(age: Int, gender: Int) : super(age) {
        this.age = age
        this.gender = gender
    }

    override fun work() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class mathTeacher : Teacher {
    override val gender: Int

    constructor(age: Int, gender: Int) : super(age, gender) {
        this.age
        this.gender = gender
    }

    override fun work() {
        super.work()
        println("")
    }
}

//接口代理
interface Driver {
    fun drive()
}

interface Writer {
    fun write()
}

class JuniorDriver : Driver {
    override fun drive() {
        println("junior drive")
    }

}

class SeniorDriver(driver: Driver) : Driver by driver {

}

open class SeniorWriter : Writer {
    override fun write() {
        println("senior write")
    }

}

class SeniorManager(driver: Driver, writera: SeniorWriter) : Driver by driver, SeniorWriter() {
    fun a() {
        this.drive()
        this.write()
    }
}

fun main(args: Array<String>) {
    SeniorManager(SeniorDriver(JuniorDriver()), SeniorWriter()).a()
}

object MusicPlayer{

}