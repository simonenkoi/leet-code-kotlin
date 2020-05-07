package rotate_array

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val rotation: Int = k % nums.size
        val temp = IntArray(nums.size)
        for (i: Int in nums.indices) {
            temp[i] = nums[(i + rotation) % nums.size]
        }
        for (i: Int in temp.indices) {
            nums[i] = temp[i]
        }
    }
}