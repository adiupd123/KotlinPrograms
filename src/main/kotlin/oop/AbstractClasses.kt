package oop

abstract class Shape(val side: Int) {
    open fun getSide() {
        println("Side: ${side}" )
    }
    abstract fun calcArea()
    abstract fun calcPerimeter()
}

class Triangle(val edge: Int): Shape(edge){
    override fun calcArea() {
        println("Area: ${1.732 * edge * edge * 1.0/4}")
    }

    override fun calcPerimeter() {
        println("Perimeter: ${3 * edge}")
    }

    override fun getSide() {
        println("Fake side is: ${0.5 * side}")
    }
}
fun main(){
    val t = Triangle(5)
    t.calcArea()
    t.calcPerimeter()
    t.getSide()
}