package palindrome_number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        var result = 0L
        var currentValue: Int = x
        while (currentValue != 0) {
            result = result * 10 + currentValue % 10
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return false
            }
            currentValue /= 10
        }
        return x == result.toInt()
    }
}