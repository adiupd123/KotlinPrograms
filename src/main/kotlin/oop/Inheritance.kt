package oop

open class Person(val age: Int, val name: String){
    init {
        println("My name is $name")
        println("My age is $age")
    }
}

class MathTeacher(val teacherAge: Int, val teacherName: String): Person(teacherAge, teacherName) {
    fun teachMath(){
        println("I love teaching maths")
    }
}

class Footballer(val footballerAge: Int, val footballerName: String): Person(footballerAge, footballerName) {
    fun playFootball() {
        println("I love playing football")
    }
}

fun main(){
    val teacher = MathTeacher(25, "Mr. Vimal Sharma")
    teacher.teachMath()
    println()
    val footballer = Footballer(18, "Christiano Ronaldo")
    footballer.playFootball()
}