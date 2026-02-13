package oop_00000136172_AishaReissaniSopyan.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Durasi Peminjaman: ")
    var loanDuration = scanner.nextInt()

    if(loanDuration < 0){
        loanDuration = 1
    }

    val loanLibrary = Loan(bookTitle, borrower, loanDuration)
    println("Judul Buku: $bookTitle")
    println("Nama Peminjam: $borrower")
    println("Durasi Peminjaman: $loanDuration")
    println("Total Denda: ${loanLibrary.calculateFine()}")
}