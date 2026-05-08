package oop_00000136172_AishaReissaniSopyan.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    val smartLamp = SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    val smartCamera = SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also{
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val newUser = User("Budi", 20).apply{
        age = 21
    }.also{
        println("User baru berhasil dibuat: $it")
    }
}