package oop_00000136172_AishaReissaniSopyan.week09

fun main(){
    val tradeHistory: List<TradeLog> = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 5.0, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 15, -3.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 2.1, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 5, -1.5, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 10, 4.3, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 8, -0.8, "CLOSED")
    )

    println("\n=== HOF: FILTER TRADE HISTORY ===")
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    println("Status CLOSED only: $closedTrades")

    println("\n=== HOF: FILTER WINNING TRADES ===")
    val winningTrades = closedTrades.filter { it.roe > 0 }
    println("ROE > 0 only: $winningTrades")
}