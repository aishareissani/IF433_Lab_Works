package oop_00000136172_AishaReissaniSopyan.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42x".toInt()
    }
}