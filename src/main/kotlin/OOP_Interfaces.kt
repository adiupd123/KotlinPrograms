interface ClickEvent{
    fun onClick(message: String)
}
class Button(val label: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $label and here's the message $message")
    }
}

/*
* An Interface specifies the methods that a class can implement regardless of inheritance status
* An Interface contains method signatures that is implemented inside the class using it.
* extends and implements keywords in Java re replaced by : in kotlin
*/
fun main() {
    val btn = Button("MyButton")
    btn.onClick("\"WoW\"")
}