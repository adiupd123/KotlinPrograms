fun main() {

    // Immutable List

    val list1 = listOf("Aditya", "Aman", "Ram", "Shyam")
    // 1st way to print a list
    println(list1)
    // 2nd way to print a list
    for(item in list1){
        print("$item ")
    }
    println()
    // 3rd way to print a list
    list1.forEach {
        print("$it ")
    }
    println()
    println("No. of elements of Immutable List: ${list1.size}")

    // Mutable List

    val list2 = mutableListOf(10, 221, 3245, 5678)
    list2.add(50)
    list2.add(0, 5)
    list2.forEach{
        print("$it ")
    }
    list2.add(2, 44)
    list2.remove(5678)
    list2.removeAt(4)
    println()
    list2.forEach{
        print("$it ")
    }
    println()
    println("No. of elements of Mutable List: ${list2.size}")
    println("Element at index: 2 of list2  is : ${list2[2]}")
    println("Element at index: 3 of list2  is : ${list2.get(3)}")
    println("Index of element \"221\" is: ${list2.indexOf(221)} ")


    //List Filter

    val foundValueList = list2.filter { it > 25 }

    println(foundValueList)
}