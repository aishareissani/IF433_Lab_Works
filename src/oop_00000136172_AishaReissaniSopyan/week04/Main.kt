package oop_00000136172_AishaReissaniSopyan.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Wuling", 2, 35)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Manager ---")
    val manager = Manager("Aisha", 10000000)
    manager.work()
    println("Bonus: ${manager.calculateBonus()}")

    println("\n--- Developer ---")
    val developer = Developer("Aishaaaa", 10000000, "Kotlin")
    println("Bonus: ${developer.calculateBonus()}")
}