package oop_00000136172_AishaReissaniSopyan.week07

enum class ItemRarity(val dropChance: Int){
    COMMON(60),
    UNCOMMON(20),
    RARE(15),
    EPIC(4),
    LEGENDARY(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)