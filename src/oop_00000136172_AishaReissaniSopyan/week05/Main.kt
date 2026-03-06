package oop_00000136172_AishaReissaniSopyan.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------")
    }

    val mathhelper = MathHelper()
    println("Luas (sisi * sisi): ${mathhelper.hitungLuas(10)}")
    println("Luas (panjang * lebar): ${mathhelper.hitungLuas(10, 30)}")
    println("Jari-jari: ${mathhelper.hitungLuas(7.5)}")

    println("\n=== AKTIVITAS PEMBAYARAN ===")

    val ewallet = EWallet("Aisha", 50000.0)
    val credit = CreditCard("Aishaa", 100000.0)

    val metodePayment: List<PaymentMethod> = listOf(ewallet, credit)

    for(payment in metodePayment){
        payment.processPayment(75000.0)

        when(payment){
            is EWallet -> {
                payment.topUp(50000.0)
                println("Setelah top-up:")
                payment.processPayment(75000.0)
            }
        }
    }
}