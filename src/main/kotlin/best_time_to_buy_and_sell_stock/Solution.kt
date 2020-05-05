package best_time_to_buy_and_sell_stock

import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxGlobal = 0
        var maxCurrent = 0

        for (i in 1 until prices.size) {
            maxCurrent += prices[i] - prices[i - 1]
            maxCurrent = max(0, maxCurrent)
            maxGlobal = max(maxCurrent, maxGlobal)
        }
        return maxGlobal
    }
}