fun main() {
    sayHello()
    calc(1, 20, "is divisible by",11)
    // Named Arguments: Arguments which are passed to a function with parameter names and
    // are used when default arguments are used in the function definition
    execOperation(z = 40)
    val catAge = calculateCatAge(5)
    println(catAge)
    if(checkAge(catAge)){
        println("Cat is too old")
    }
    else {
        println("Cat is young blud")
    }
}

fun sayHello(){
    println("Hello World")
}

fun calc(first: Int, second: Int, msg: String, div: Int) {
    for(i in first..second){
        if(i % div == 0){
            println("$i $msg $div")
        }
    }
}

// Default Arguments: Arguments that are default value of parameters where the function is defined

fun sum(x: Int, y: Int = 50, z: Int): Int{
    return x+y+z
}
fun calculateCatAge(age: Int) = age * 7

fun checkAge(catAge: Int): Boolean{
   return catAge >= 40
}
fun execOperation(x: Int = 10, y: Int = 20, z: Int = 30){
    println("$x $y $z")
}