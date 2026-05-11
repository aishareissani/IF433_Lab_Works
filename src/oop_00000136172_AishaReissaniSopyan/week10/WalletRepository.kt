package oop_00000136172_AishaReissaniSopyan.week10

class WalletRepository<T: Any>(){
    private val items = mutableListOf<T>()
    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T>{
        return items
    }

    fun searchName(name: String): List<T> {
        return items.filter {
            it.toString().contains(name)
        }
    }
}

