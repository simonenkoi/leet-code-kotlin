package valid_palindrome

class Solution {

    fun isPalindrome(s: String): Boolean {
        val filteredInput: String = s.toLowerCase().filter(Char::isLetterOrDigit)
        return filteredInput.reversed() == filteredInput
    }

}