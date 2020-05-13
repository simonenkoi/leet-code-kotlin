package move_zeroes

class Solution {
    fun moveZeroes(nums: IntArray) {
        if (nums.isEmpty()) return
        var current = 0
        for (i: Int in nums.indices) {
            if (nums[i] != 0) {
                val temp: Int = nums[current]
                nums[current++] = nums[i]
                nums[i] = temp
            }
        }
    }
}