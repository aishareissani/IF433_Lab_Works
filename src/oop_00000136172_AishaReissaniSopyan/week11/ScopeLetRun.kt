package oop_00000136172_AishaReissaniSopyan.week11

fun main(){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // dieksekusi jika tidak null
    val length = name?.let{
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}