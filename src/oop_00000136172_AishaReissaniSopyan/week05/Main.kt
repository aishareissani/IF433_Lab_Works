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


}