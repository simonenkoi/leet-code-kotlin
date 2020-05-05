package path_sum

class Solution {
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
        return hasPathSum(root, sum, 0)
    }

    private fun hasPathSum(root: TreeNode?, sum: Int, currentSum: Int): Boolean {
        if (root == null) return false
        val newCurrentSum: Int = root.`val` + currentSum
        if (root.left == null && root.right == null) {
            return sum == newCurrentSum
        }
        return hasPathSum(root.left, sum, newCurrentSum)
                || hasPathSum(root.right, sum, newCurrentSum)
    }
}