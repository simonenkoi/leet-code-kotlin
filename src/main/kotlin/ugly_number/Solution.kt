package ugly_number

class Solution {
    fun isUgly(num: Int): Boolean {
        if (num == 0) return false
        var n: Int = num
        for (i: Int in listOf(2, 3, 5)) {
            while (n % i == 0) {
                n /= i
            }
        }
        return n == 1
    }
}