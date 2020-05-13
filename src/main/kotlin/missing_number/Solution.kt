package missing_number

class Solution {
    fun missingNumber(nums: IntArray): Int = sumOfArithmeticProgression(nums.size + 1) - nums.sum()

    private fun sumOfArithmeticProgression(n: Int): Int = (n * (n - 1)) / 2
}