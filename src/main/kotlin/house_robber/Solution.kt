package house_robber

import kotlin.math.max

class Solution {

    private lateinit var memoization: IntArray

    fun rob(nums: IntArray): Int {
        memoization = IntArray(nums.size) { -1 }
        return rob(nums, nums.lastIndex)
    }

    private fun rob(nums: IntArray, i: Int): Int {
        if (i < 0) {
            return 0
        }
        if (memoization[i] >= 0) {
            return memoization[i]
        }
        val result: Int = max(rob(nums, i - 2) + nums[i], rob(nums, i - 1))
        memoization[i] = result
        return result
    }
}