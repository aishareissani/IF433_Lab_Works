package oop_00000136172_AishaReissaniSopyan.week06

class SmartCCTV (override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn(){
        println("CCTV $name turn ON")
        startRecord()
    }

    override fun turnOff(){
        println("CCTV $name turn OFF")
        stopRecord()
    }

    override fun startRecord(){
        println("Memulai record CCTV $name")
    }

}