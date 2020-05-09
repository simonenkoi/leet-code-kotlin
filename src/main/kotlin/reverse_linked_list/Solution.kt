package reverse_linked_list

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return null
        var currNode: ListNode? = head
        var prevNode: ListNode? = null
        while(currNode != null) {
            val nextNode: ListNode? = currNode.next
            currNode.next = prevNode
            prevNode = currNode
            currNode = nextNode
        }
        return prevNode
    }
}