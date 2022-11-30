fun main() {
    val car = Car("BLUE", "AHS")
    val car2 = Car()
    println("Car1 Color: ${car.color} Model: ${car.model}")
    println("Car2 Color: ${car2.color} Model: ${car2.model}")
    car.speed(20, 250)
    car2.speed(30, 275)
    car.drive()
    val truck = Truck("Magenta", "F16")
    truck.drive()
}

class Truck(color: String = "RED", model: String = "XMD"): Car(color, model){
    init {
        println("Parent Class Car's Inherited Properties: Color: $color Model: $model")
    }

    override
    fun drive(){
        println("Truck goes vrooommmmm.....")
    }
}

open class Car(color: String = "RED", model: String = "XMD"){
    var color: String = color
    var model: String = model

    init {
        if(color == "BLUE")
            println("Color of Car is Bloooo")
        else
            println("Color of Car is Boring")
    }
    init {
        println("My Own Car")
    }

    fun speed(minSpeed: Int, maxSpeed: Int){
        println("$this MinSpeed = $minSpeed MaxSpeed = $maxSpeed")
    }
    open fun drive(): Unit{
        println("Car goes vroooommmm.......")
    }
}