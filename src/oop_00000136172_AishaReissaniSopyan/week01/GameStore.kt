package oop_00000136172_AishaReissaniSopyan.week01

fun main(){
    val gameTitle = "SteamKW"
    val price = 600000
    val userNote: String? = null

    printReceipt(title = gameTitle, finalPrice = price - calculateDiscount(price), note = userNote)
}

fun calculateDiscount(price: Int): Int = when{
    price > 500000 -> price * 20/100
    else -> price * 10/100
}

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("$title, $finalPrice")
    println(note ?: "Tidak ada catatan")

}