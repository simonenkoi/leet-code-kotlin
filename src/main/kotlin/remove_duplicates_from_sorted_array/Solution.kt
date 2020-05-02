package remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var result = 1
        for (i: Int in 1 until nums.size) {
            if (nums[i - 1] != nums[i]) {
                nums[result++] = nums[i]
            }
        }
        return result
    }
}