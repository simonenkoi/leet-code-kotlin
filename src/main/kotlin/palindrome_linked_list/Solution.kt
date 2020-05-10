package palindrome_linked_list

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        var middle: ListNode? = findMiddleOfList(head)
        middle = reverse(middle)
        var fast: ListNode? = head
        while (middle != null) {
            if (fast?.`val` != middle.`val`) {
                return false
            }
            fast = fast.next
            middle = middle.next
        }
        return true
    }

    private fun findMiddleOfList(head: ListNode?): ListNode? {
        var fast: ListNode? = head
        var slow: ListNode? = head
        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }
        if (fast != null) {
            slow = slow?.next
        }
        return slow
    }

    private fun reverse(head: ListNode?): ListNode? {
        var head: ListNode? = head
        var prev: ListNode? = null
        while (head != null) {
            val next: ListNode? = head.next
            head.next = prev
            prev = head
            head = next
        }
        return prev
    }
}