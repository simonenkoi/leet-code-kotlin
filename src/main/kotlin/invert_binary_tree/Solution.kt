package invert_binary_tree

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val left: TreeNode? = root.left
        val right: TreeNode? = root.right
        root.left = invertTree(right)
        root.right = invertTree(left)
        return root
    }
}