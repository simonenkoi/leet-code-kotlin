package linked_list_cycle

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false
        val visitedNodes = HashSet<ListNode>()
        var currentNode: ListNode? = head
        while (currentNode != null) {
            if (visitedNodes.contains(currentNode)) {
                return true
            }
            visitedNodes.add(currentNode)
            currentNode = currentNode.next
        }
        return false
    }
}