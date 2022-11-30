fun main() {
    println("Hello, ".append("Jenny").append(" my dear").append("\nI care about you."))
    println("10th power of 2 is ${2.power(10)}")

    var name = "Aditya"
    println(name.removeFL())

    // Data Class
    val man1 = Person("Aditya", 110, 21)
    val man2 = Person("Aman", 111, 24)
    val man3 = Person("Rajesh", 112, 22)
    val listOfPeople = listOf<Person>(man1, man2, man3)
    listOfPeople.forEach{
        println("${it.age}")
    }

}

fun String.append(toAppend: String): String{
    return this.plus(toAppend)
}

fun Int.power(n: Int): Int{
    return Math.pow(this.toDouble(), n.toDouble()).toInt()
}

fun String.removeFL(): String{
    return this.substring(1, this.length-1)
}

data class Person(val name: String, val emp_Id: Int, val age: Int)