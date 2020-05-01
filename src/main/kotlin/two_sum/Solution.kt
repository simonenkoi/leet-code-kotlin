package two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int> = HashMap()
        for (i: Int in nums.indices) {
            val difference: Int = target - nums[i]
            if (map.containsKey(difference)) {
                return intArrayOf(map.getValue(difference), i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("Array doesn't contain suitable elements")
    }
}