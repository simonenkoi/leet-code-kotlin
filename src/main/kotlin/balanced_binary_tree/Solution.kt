package balanced_binary_tree

import kotlin.math.abs
import kotlin.math.max

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        return maxDepth(root) != -1
    }

    private fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0;
        }
        val left: Int = maxDepth(root.left)
        val right: Int = maxDepth(root.right)
        return if (left != -1 && right != -1 && abs(left - right) <= 1) {
            max(left, right) + 1
        } else -1
    }
}