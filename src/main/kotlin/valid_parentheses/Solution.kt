package valid_parentheses

import java.util.ArrayDeque
import java.util.Deque

class Solution {

    companion object {
        private val PARENTHESES: Map<Char, Char> = mapOf(
            ')' to '(',
            ']' to '[',
            '}' to '{'
        )
    }

    fun isValid(s: String): Boolean {
        val stack: Deque<Char> = ArrayDeque()
        for (ch in s) {
            if (PARENTHESES.values.contains(ch)) {
                stack.push(ch)
            } else if (stack.poll() != PARENTHESES.getValue(ch)) {
                return false
            }
        }
        return stack.isEmpty()
    }
}
