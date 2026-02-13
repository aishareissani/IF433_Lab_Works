package oop_00000136172_AishaReissaniSopyan.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    var enemyHp = 100

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Stat Damage: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()

    val heroStat = Hero(name, 100, baseDamage)

    while (heroStat.isAlive() && enemyHp > 0){
        print("Menu (1. Serang, 2. Kabur): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if(type == 1){
            enemyHp -= baseDamage
            println("HP Enemy: $enemyHp")

            if(enemyHp > 0){
                heroStat.takeDamage((10..20).random())
            }
            println("HP $name: ${heroStat.hp}")
        }else if(type == 2){
            heroStat.attack("Lala")
            break
        }
    }
    println("Final HP Enemy: $enemyHp")
    println("Final HP $name: ${heroStat.hp}")
}