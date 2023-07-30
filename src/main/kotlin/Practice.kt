
fun main(){
    val x: Int? = null
    val y = 10
    val z = 0xFF
    val b = false
    val a = '5'.digitToInt(10)
    println("$x $y $z $b $a")
    // Raw String
    val text = """
        for(c in "foo")
            print(c)
    """.trimIndent()
    println(text)
    // Arrays
    val arr = arrayOf("AB", "CD",  "EF",  "GH")
    arr.set(2, "QW")
    arr.forEach{
        print("$it ")
    }
    println()
    println(5.toShort().toFloat())
    val array = Array(5){ 0 }
    array.forEach {
        print("$it ")
    }
    println("\n${arr[1]}")

    when(y) {
        5,6,7 -> {
            println("when $y")
        }
        10 -> {
            println("when $y")
        }
        12 -> {
            println("when $y")
        }
        else -> {
            println("else of when $y")
        }
    }
    for(i in 5 downTo 1 step 2){
        println("$i")
    }
    for (i in 5 downTo 1)
        println("$i")
    var txt= "Kotlin"
    for(item in txt){
        print("$item ")
    }
    println()
    for (item in txt.indices) {
        print("${txt[item]} ")
    }
    println()
    first@ for(i in 1..5){
        second@ for(j in 1..5){
            if(j==3 && i==3)
                break@second
            println("$i, $j")
        }
    }
}