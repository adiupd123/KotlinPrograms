fun main() {
    val map1 = mapOf("first" to 1, "second" to 2, "third" to 3, "fourth" to 4)
    val map2 = mutableMapOf(1 to "A", 2 to "B", 3 to "C", 4 to "D")
    println(map1)
    println(map1.keys)
    println(map1.values)
    for(item in map1){
        print("$item ")
    }
    println()
    for(item in map1.keys)
        print("$item ")
    println()
    for(item in map1.values)
        print("$item ")
    println()
    for(item in map1.entries)
        print("$item ")
    println()
    println(map2)
    map2.put(5, "E")
    if("A" in map2.values)
        println("A")
    if(5 in map2)
        println(map2[5])
    map2.forEach{
        print("$it ")
    }
    println()
    map2.keys.forEach{
        print("$it ")
    }
    println()
    map2[3] = "F"
    println(map2)
    val ls = emptyList<Int>()
    val st = emptySet<Int>()
    val mp = emptyMap<Int, Int>()

    // Filter Maps
    val filteredMap = map2.filter { (key, value) -> key%2==0 && value == "D" }
    println(filteredMap)
}