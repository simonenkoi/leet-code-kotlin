package sqrt

class Solution {
    fun mySqrt(x: Int): Int {
        if (x == 0 || x == 1)
            return x
        var lowerBound = 1
        var upperBound = x
        var result = 0
        while (lowerBound <= upperBound) {
            val mid = (lowerBound + upperBound) / 2

            if (mid * mid == x)
                return mid

            if (mid * mid < x) {
                lowerBound = mid + 1
                result = mid
            } else
                upperBound = mid - 1
        }
        return result
    }
}