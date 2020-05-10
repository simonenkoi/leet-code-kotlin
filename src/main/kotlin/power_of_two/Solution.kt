package power_of_two

class Solution {
    fun isPowerOfTwo(n: Int): Boolean = n > 2 && Integer.bitCount(n) > 1
}