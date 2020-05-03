package length_of_last_word

class Solution {
    fun lengthOfLastWord(s: String): Int {
        if (s.isBlank()) return 0
        var result = 0
        for (i in s.lastIndex downTo 0) {
            if (s[i].isWhitespace()) {
                if (result == 0) continue
                return result
            }
            ++result
        }
        return result
    }
}