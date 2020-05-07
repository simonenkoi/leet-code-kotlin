package two_sum_ii

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right: Int = numbers.lastIndex
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return intArrayOf(left + 1, right + 1)
            }
            if (numbers[left] + numbers[right] < target) {
                left++
            } else {
                right--
            }
        }
        return intArrayOf()
    }
}