package maximum_subarray

import kotlin.math.max

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxGlobal = nums[0]
        var maxCurrent = nums[0]

        for (i in 1 until nums.size) {
            maxCurrent = max(nums[i], maxCurrent + nums[i])
            maxGlobal = max(maxCurrent, maxGlobal)
        }
        return maxGlobal
    }
}