package symmetric_tree

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return root == null || isSymmetric(root.left, root.right)
    }

    private fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }
        return left?.`val` == right?.`val`
                && isSymmetric(left?.left, right?.right)
                && isSymmetric(left?.right, right?.left)
    }
}