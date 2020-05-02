package str_str

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0

        for (i in haystack.indices) {
            if (i + needle.length > haystack.length) break

            for (j in needle.indices) {
                if (haystack[i + j] != needle[j]) break

                if (j == needle.length - 1) {
                    return i
                }
            }
        }
        return -1
    }
}