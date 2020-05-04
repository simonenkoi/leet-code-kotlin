package maximum_depth_of_binary_tree

import kotlin.math.max

class Solution {

    fun maxDepth(root: TreeNode?, acc: Int = 0): Int {
        if (root == null) {
            return acc
        }
        return max(maxDepth(root.left, acc + 1), maxDepth(root.right, acc + 1))
    }
}