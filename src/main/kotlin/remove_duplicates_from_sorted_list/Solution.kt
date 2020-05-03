package remove_duplicates_from_sorted_list

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        head.next = deleteDuplicates(head.next)
        return if (head.`val` == head.next?.`val`) head.next else head
    }
}