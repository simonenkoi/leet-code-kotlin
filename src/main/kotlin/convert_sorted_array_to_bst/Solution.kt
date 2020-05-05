package convert_sorted_array_to_bst

class Solution {
    fun sortedArrayToBST(nums: IntArray, low: Int = 0, high: Int = nums.lastIndex): TreeNode? {
        if (low > high) return null

        val mid: Int = (high + low) / 2
        return TreeNode(nums[mid]).apply {
            left = sortedArrayToBST(nums, low, mid - 1)
            right = sortedArrayToBST(nums, mid + 1, high)
        }
    }
}