package majority_element

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (n: Int in nums) {
            map[n] = map.getOrDefault(n, 0) + 1
            if (map.getValue(n) > nums.size / 2) {
                return n
            }
        }
        return -1
    }
}