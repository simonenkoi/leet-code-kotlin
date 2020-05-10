package lowest_common_ancestor_of_bst

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null || p == null || q == null) {
            return null
        }
        return if (root.`val` > p.`val` && root.`val` > q.`val`) {
            lowestCommonAncestor(root.left, p, q)
        } else if (root.`val` < p.`val` && root.`val` < q.`val`) {
            lowestCommonAncestor(root.right, p, q)
        } else {
            root
        }
    }
}