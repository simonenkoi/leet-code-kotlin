package single_number

class Solution {
    fun singleNumber(nums: IntArray): Int {
        val set = HashSet<Int>()
        for (item: Int in nums) {
            if (set.contains(item)) {
                set.remove(item)
            } else {
                set.add(item)
            }
        }
        return set.single()
    }
}