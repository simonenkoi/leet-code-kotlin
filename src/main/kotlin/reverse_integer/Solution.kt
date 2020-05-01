package reverse_integer

class Solution {
    fun reverse(x: Int): Int {
        var result = 0L
        var currentValue: Int = x
        while (currentValue != 0) {
            result = result * 10 + currentValue % 10
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0
            }
            currentValue /= 10
        }
        return result.toInt()
    }
}