package oop_00000136172_AishaReissaniSopyan.week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout...")
    method.pay(amount) // dynamic polymorphism
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n === TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val smartlamp = SmartLamp("L01", "Ruang Tamu")
    val smartspeaker = SmartSpeaker("S01", "Google Nest Dapur")
    val smartcctv = SmartCCTV ("C001", "Ezviz Garasi")

}