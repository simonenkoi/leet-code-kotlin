package factorial_trailing_zero

class Solution {
    fun trailingZeroes(n: Int): Int = if (n >= 2) n / 5 + trailingZeroes(n / 5) else 0
}