package oop_00000136172_AishaReissaniSopyan.week07

object DatabaseManager{
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}