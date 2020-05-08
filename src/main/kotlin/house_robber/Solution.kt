package house_robber

import kotlin.math.max

class Solution {
    fun rob(nums: IntArray): Int {
        return rob(nums, nums.lastIndex)
    }

    private fun rob(nums: IntArray, i: Int): Int {
        return if (i >= 0) {
            max(rob(nums, i - 2) + nums[i], rob(nums, i - 1))
        } else 0
    }
}