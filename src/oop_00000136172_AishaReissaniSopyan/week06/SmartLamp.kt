package oop_00000136172_AishaReissaniSopyan.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable{
    override fun turnOn(){
        println("Lamp $name turn ON")
    }

    override fun turnOff(){
        println("Lamp $name turn OFF")
    }
}