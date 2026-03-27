package oop_00000136172_AishaReissaniSopyan.week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}