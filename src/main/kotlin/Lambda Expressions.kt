import kotlin.math.pow

fun main() {
    println(add(1, 100))
    println(sum(5, 100))
    println(catAge(8))
    showName("Aditya")
    // Trailing Lambda
    enhancedMessage("Hello, there"){
        5+10
    }
    val p = 1000
    val r = 5
    val t = 3.5
    val ci: Double = compoundInterest(p, r, t)

    val life = true
    val isPositive = true
    while(life == true){
        if(isPositive)
            workHard()
        else
            bePositive()
    }
}

fun bePositive() {
    TODO("Not yet implemented")
    println("Work hard")

}

fun workHard() {
    TODO("Not yet implemented")
    println("Code")
}

fun add(a: Int, b: Int): Int{
    return a + b
}
// Lambda Expression of add()
val sum: (Int, Int) -> Int = {
        a, b ->
    a+b
}

// Lambda Expression using single parameter with "it"
val catAge: (Int) -> Int = {
        it ->
    println("Hello Catty")
    it * 7
}

// Lambda Expression that does not return anything
val showName: (String) -> Unit = { it -> println("Hello $it")}

fun enhancedMessage(message: String, funAsParameter: () -> Int){
    println("$message ${funAsParameter()}")
}

// ci = p*(1+r/100)^t
fun compoundInterest(p: Int, r: Int, t: Double): Double{
    return p * (1 + r / 100).toDouble().pow(t)
}
