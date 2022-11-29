fun main(){
    var x: Int = 5
    if(x in 5..10){
        println("$x is large")
    }
    else{
        println("$x is small")
    }
    x = 0
    when(x){
        in 5..10 -> println("$x is large")
        0 -> println("$x is zero")
        else -> println("$x is small")
    }

    for(i in 1..10){
        println(i)
    }

    println("---------")

    for(i in 1..10 step 2){
        println(i)
    }

    println("---------")

    var n = 5

    for(i in n downTo 1)
        println(i)

    println("---------")
}