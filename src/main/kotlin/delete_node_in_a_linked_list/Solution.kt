package delete_node_in_a_linked_list

class Solution {
    fun deleteNode(node: ListNode?) {
        if (node?.next == null) return
        val nextNode: ListNode = node.next!!
        node.`val` = nextNode.`val`
        node.next = nextNode.next
        nextNode.next = null
    }
}