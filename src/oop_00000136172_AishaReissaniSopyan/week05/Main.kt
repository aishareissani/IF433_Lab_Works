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

    val sisi = hitungLuas(10)
    val panjangLebar = hitungLuas(10, 20)
    val jariJari = hitungLuas(7.4)

    println("Luas: $sisi")
    println("Luas (panjang * lebar): $panjangLebar")
    println("Jari-jari: $jariJari")


}