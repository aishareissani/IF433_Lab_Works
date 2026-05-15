package oop_00000136172_AishaReissaniSopyan.week12

class InsufficientMoneyException (
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")