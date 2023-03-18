package oop

import kotlin.properties.Delegates

class Bicycle{
    private var currentGear: Int = 1
    private var noOfGears: Int = 6
    private var curSpeed: Int = 0
    private var started: Int = 0


    fun getCurrentGear(): Int{
        return this.currentGear
    }
    fun increaseGear(){
        if(this.currentGear == 6){
            println("Current Gear is maximum")
            return
        }
        this.currentGear = this.currentGear + 1
    }
    fun decrementGear() {
        if(this.currentGear == 1){
            println("Current Gear is minimum")
            return
        }
        this.currentGear = this.currentGear - 1
    }
    fun getNoOfGears(): Int {
        return this.noOfGears
    }
}
class Box(){
    private var l: Int = 0
    private var b: Int = 0
    private var h: Int = 0
    fun getL() = this.l
    fun setL(l: Int){
        this.l = l
    }
}
fun main(){
    val b = Bicycle()
    b.increaseGear()
    b.increaseGear()
    b.increaseGear()
    b.increaseGear()
    b.increaseGear()
    b.increaseGear()
}