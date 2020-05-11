package valid_anagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean = s.charCount() == t.charCount()

    private fun String.charCount(): Map<Char, Int> = this.groupingBy { it }.eachCount()
}