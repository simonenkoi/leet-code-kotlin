package count_primes

import kotlin.math.sqrt

class Solution {
    fun countPrimes(n: Int): Int {
        return countPrimes(getPrimesArray(n), n)
    }

    private fun getPrimesArray(n: Int): BooleanArray {
        val primes = BooleanArray(n) { true }
        val sqrt: Int = sqrt(n.toDouble()).toInt()
        for (i: Int in 2..sqrt) {
            if (primes[i]) {
                var j: Int = i * i
                while (j < n) {
                    primes[j] = false
                    j += i
                }
            }
        }
        return primes
    }

    private fun countPrimes(primes: BooleanArray, n: Int): Int {
        var count = 0
        for (i: Int in 2 until n) {
            if (primes[i]) {
                count++
            }
        }
        return count
    }
}