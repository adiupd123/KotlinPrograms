// Top level Variables
var greeting = "Konichiwa"
fun main(){
    /*
    *  var - mutable
    *  val - immutable
    *  Best Practice: In essence use val over var
    * */
    // Variables of Immutable type
    val name = "Kotlin"
    println(greeting + " " +  name)
    println("Hello $name")
    println("${greeting::class.simpleName}")
    // Variables of mutable type
    var x = 10
    var y = 20
    println("Original Values: $x and $y")
    x = x+y
    y = x-y
    x = x-y
    println("Swapped values: $x and $y")

    // Ways to initialize a variable
    // 1st way: declaration and initialization together, here the type of the variable is inferred to the value assigned
    val myName = "Aditya Upadhyay"
    // 2nd way: Declaration first, Initialization is done at any time as needed
    val age: Int
    age = 21
    println("Hello, my name is $myName. I'm $age years old.")

    //Types in Kotlin
    var a: Int
    var b: Byte
    var c: Short
    a = 1024*1024*1024
    println(a)
    var d: Float
    var e: Double
    d = 1.23456789F
    e = 1.2345678903405
    var f = 1.2345678990234567890
    println("$d $e $f")

    var s:String?
    s = null
    println(s)
}