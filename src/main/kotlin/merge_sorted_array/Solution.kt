package merge_sorted_array

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i: Int = m - 1
        var j: Int = n - 1
        var k: Int = m + n - 1
        while (i >= 0 && j >= 0) {
            nums1[k--] = if (nums1[i] >= nums2[j]) nums1[i--] else nums2[j--]
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--]
        }
    }
}