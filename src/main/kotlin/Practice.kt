
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
}