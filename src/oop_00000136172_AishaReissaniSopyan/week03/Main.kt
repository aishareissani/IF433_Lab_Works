package oop_00000136172_AishaReissaniSopyan.week03

fun main(){
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
//    e.performaceRating = 5

    println("Pajak yang harus dibayar: ${e.tax}")
}