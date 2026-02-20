package oop_00000136172_AishaReissaniSopyan.week03

fun main(){
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    val weapon = Weapon("Aisha")
    weapon.damage = -50

    println("Tier: ${weapon.tier}")
}