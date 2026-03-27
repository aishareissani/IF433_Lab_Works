package oop_00000136172_AishaReissaniSopyan.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Muncul ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            println("Selamat kamu mendapatkan ${event.item.name}! dengan rarity ${event.item.rarity}")
        }
        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di Safe Zone")
        }
    }
}