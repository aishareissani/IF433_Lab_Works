package oop_00000136172_AishaReissaniSopyan.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get(){
            return (xp/100) + 1
        }

    fun addXp(amount: Int){
        val oldLevel = level

        if(amount > 0){
            xp += amount
            if(level > oldLevel){
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}