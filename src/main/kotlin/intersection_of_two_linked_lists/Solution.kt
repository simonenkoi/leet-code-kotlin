package intersection_of_two_linked_lists

class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null || headB == null) return null

        var currentA: ListNode? = headA
        var currentB: ListNode? = headB

        while (currentA != currentB) {
            currentA = if (currentA != null) currentA.next else headB
            currentB = if (currentB != null) currentB.next else headA
        }
        return currentA
    }
}