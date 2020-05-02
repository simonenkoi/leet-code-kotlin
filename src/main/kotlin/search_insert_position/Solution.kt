package search_insert_position

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1
        while (low <= high) {
            val mid: Int = (low + high) / 2
            if (nums[mid] == target) {
                return mid
            }
            if (nums[mid] > target) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        return low
    }
}