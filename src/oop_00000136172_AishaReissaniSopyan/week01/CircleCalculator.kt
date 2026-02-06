package oop_00000136172_AishaReissaniSopyan.week01

fun main() {
    val radius = 7.0
    val pi = 3.14
    val area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")

    val result = checkSize(area)
    println("Result: $result")
}

fun checkSize(area: Double) = when{
    area > 100 -> "This is a Big Circle"
    else -> "This is a Small Circle"
}








