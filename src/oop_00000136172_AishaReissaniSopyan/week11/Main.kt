package oop_00000136172_AishaReissaniSopyan.week11

fun main(){
    println("\n=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run{
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}