package minimum_depth_of_binary_tree

import kotlin.math.min

class Solution {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val leftDepth: Int = minDepth(root.left)
        val rightDepth: Int = minDepth(root.right)
        return if (leftDepth != 0 && rightDepth != 0) {
            min(leftDepth, rightDepth) + 1
        } else {
            leftDepth + rightDepth + 1
        }
    }
}