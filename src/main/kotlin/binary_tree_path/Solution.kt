package binary_tree_path

class Solution {
    fun binaryTreePaths(root: TreeNode?, path: String = "", list: MutableList<String> = mutableListOf()): List<String> {
        if (root == null) {
            return list
        }
        if (root.left == null && root.right == null) {
            list.add(path + root.`val`)
        }
        binaryTreePaths(root.left, path + root.`val`.toString() + "->", list)
        binaryTreePaths(root.right, path + root.`val`.toString() + "->", list)
        return list
    }
}