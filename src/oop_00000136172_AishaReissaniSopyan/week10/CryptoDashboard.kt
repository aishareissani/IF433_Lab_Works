package oop_00000136172_AishaReissaniSopyan.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 100.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("T001", 100000.0))
    txRepo.add(Transaction("T002", 250000.0))
}