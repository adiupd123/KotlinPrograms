package oop

class Outer {
    val a = "Outer Class Member"

    // Nested Class
    class Nested {
        fun callMe(){
            println("Nested Class Method")
        }
    }

    // Inner Class
    inner class Inner {
        fun callIt(): String {
            println("Inner Class Method")
            return a
        }
    }

}

fun main(){
    val nested = Outer.Nested()
    nested.callMe()
    println()
    val inner = Outer().Inner()
    println(inner.callIt())
}