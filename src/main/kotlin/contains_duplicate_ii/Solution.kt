package contains_duplicate_ii

import java.util.HashSet

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val set = HashSet<Int>()
        for (i: Int in nums.indices) {
            if (i > k) {
                set.remove(nums[i - k - 1])
            }
            if (set.contains(nums[i])) return true
            set.add(nums[i])
        }
        return false
    }
}