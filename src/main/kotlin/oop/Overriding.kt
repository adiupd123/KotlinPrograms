package oop

// Empty primary constructor
open class Human() {
    open var type: String = "Human"
    open fun displayAge(age: Int) {
        println("My age is $age.")
    }
}

class Girl: Human() {
    override var type: String = "Girl"
    override fun displayAge(age: Int) {
        println("My fake age is ${age - 5}.")
    }
}

fun main(args: Array<String>) {
    val girl = Girl()
    girl.displayAge(31)
    println(girl.type)
}