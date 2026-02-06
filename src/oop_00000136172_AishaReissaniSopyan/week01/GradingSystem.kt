package oop_00000136172_AishaReissaniSopyan.week01

fun main(){
    val name = "Aisha Reissani"
    val score = 80

    printIn("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    printIn("Grade kamu: $grade")
}