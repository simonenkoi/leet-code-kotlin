package happy_number

class Solution {
    fun isHappy(n: Int): Boolean {
        var slow: Int = sumOfSquareOfDigits(n)
        var fast: Int = sumOfSquareOfDigits(sumOfSquareOfDigits(n))
        while (fast != 1 && slow != fast) {
            slow = sumOfSquareOfDigits(slow)
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast))
        }
        return fast == 1
    }

    private fun sumOfSquareOfDigits(n: Int): Int {
        var nCopy = n
        var sum = 0
        while (nCopy > 0) {
            sum += (nCopy % 10) * (nCopy % 10)
            nCopy /= 10
        }
        return sum
    }
}