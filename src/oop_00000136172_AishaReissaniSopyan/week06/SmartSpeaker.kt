package oop_00000136172_AishaReissaniSopyan.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn(){
        println("Speaker $name turn ON")
    }

    override fun turnOff(){
        println("Speaker $name turn OFF")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}