package oop_00000136172_AishaReissaniSopyan.week12

class InsufficientMoneyException (
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double){
    fun withdraw(amount: Double){
        if(amount > 0){
            throw IllegalArgumentException("Amount must be positive")
        }
        if(amount > balance){
            throw InsufficientMoneyException(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}