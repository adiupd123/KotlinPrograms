fun main() {
    sayHello()
//    calc(1, 20, 3)
    // Named Arguments
    println(sum(x = 2, z = 3))
}

fun sayHello(){
    println("Hello World")
}
fun calc(first: Int, second: Int, div: Int){
    for(i in first..second){
        if(i % div == 0)
            println(i)
    }
}

// Default Arguments

fun sum(x: Int, y: Int = 50, z: Int): Int{
    return x+y+z
}
