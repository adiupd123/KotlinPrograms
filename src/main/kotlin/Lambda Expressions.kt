fun main() {
    println(add(1, 100))
    println(sum(5, 100))
    println(catAge(8))
    showName("Aditya")
    // Trailing Lambda
    enhancedMessage("Hello, there"){
        5+10
    }
}
fun add(a: Int, b: Int): Int{
    return a + b
}
// Lambda Expression of add()
val sum: (Int, Int) -> Int = { a, b -> a+b}

// Lambda Expression using single parameter with "it"
val catAge: (Int) -> Int = {
        it ->
    println("Hello Catty")
    it * 7 }

// Lambda Expression that does not return anything
val showName: (String) -> Unit = { it -> println("Hello $it")}

fun enhancedMessage(message: String, funAsParameter: () -> Int){
    println("$message ${funAsParameter()}")
}

