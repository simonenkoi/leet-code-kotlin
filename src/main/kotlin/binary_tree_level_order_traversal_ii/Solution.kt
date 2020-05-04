package binary_tree_level_order_traversal_ii

import java.util.ArrayDeque
import java.util.Queue


class Solution {
    fun levelOrderBottom(
        root: TreeNode?,
        list: MutableList<MutableList<Int>> = mutableListOf(),
        level: Int = 0
    ): List<List<Int>> {
        if (root == null) return list;
        if (level >= list.size) {
            list.add(0, mutableListOf())
        }
        levelOrderBottom(root.left, list, level + 1)
        levelOrderBottom(root.right, list, level + 1)
        list[list.size - level - 1].add(root.`val`)
        return list
    }

    fun levelOrderBottom(root: TreeNode?): List<List<Int>>? {
        val queue: Queue<TreeNode> = ArrayDeque<TreeNode>()
        val wrapList: MutableList<MutableList<Int>> = mutableListOf()
        if (root == null) return wrapList
        queue.offer(root)
        while (!queue.isEmpty()) {
            val levelNum: Int = queue.size
            val subList: MutableList<Int> = mutableListOf()
            for (i in 0 until levelNum) {
                if (queue.peek().left != null) queue.offer(queue.peek().left)
                if (queue.peek().right != null) queue.offer(queue.peek().right)
                subList.add(queue.poll().`val`)
            }
            wrapList.add(0, subList)
        }
        return wrapList
    }
}