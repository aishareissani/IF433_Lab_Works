package oop_00000136172_AishaReissaniSopyan.week01

fun main(){
    val gameTitle = "SteamKW"
    val price = 600000


}

fun calculateDiscount(price: Int): Int = when{
    price > 500000 -> price * 20/100
    else -> price * 10/100
}