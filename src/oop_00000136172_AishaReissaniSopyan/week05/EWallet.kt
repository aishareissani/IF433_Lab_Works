package oop_00000136172_AishaReissaniSopyan.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if(balance >= amount) {
            balance -= amount
            println("Saldo cukup. Transaksi Sukses!")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }
}