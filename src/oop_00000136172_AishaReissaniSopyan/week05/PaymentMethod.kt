package oop_00000136172_AishaReissaniSopyan.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}