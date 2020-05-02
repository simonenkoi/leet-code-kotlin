package remove_element

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0
        for (i: Int in nums.indices) {
            if (nums[i] != `val`) {
                nums[index] = nums[i]
                ++index
            }
        }
        return index
    }
}