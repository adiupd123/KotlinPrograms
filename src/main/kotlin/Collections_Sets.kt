fun main() {
    val mySet = setOf("AU", "NZ", "IN")
    println(mySet)

    val mutableSet = mutableSetOf(1, 4, 5, 6, 2, 7)
    mutableSet.add(9)
    mutableSet.remove(1)
    println(mutableSet)
    for(item in mutableSet)
        print("$item ")
    println()
    mutableSet.forEach{
        print("$it ")
    }
}