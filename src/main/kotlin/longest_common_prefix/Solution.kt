package longest_common_prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        val sortedInput: Array<String> = strs.sortedArray()
        return longestCommonPrefix(sortedInput.first(), sortedInput.last())
    }

    private fun longestCommonPrefix(str1: String, str2: String): String {
        var result = ""
        for (i in str1.indices) {
            if (i >= str2.length || str1[i] != str2[i]) {
                break;
            }
            result += str1[i]
        }
        return result
    }
}