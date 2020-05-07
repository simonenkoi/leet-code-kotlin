package excel_sheet_column_number

class Solution {
    companion object {
        const val ALPHABET_SIZE: Int = 26
        const val ASCII_SHIFT: Int = 'A'.toInt() - 1
    }

    fun titleToNumber(s: String): Int {
        var result = 0
        var multiplier = 1
        for (i in s.lastIndex downTo 0) {
            result += (s[i].toInt() - ASCII_SHIFT) * multiplier
            multiplier *= ALPHABET_SIZE
        }
        return result
    }
}

fun main() {
    Solution().titleToNumber("efef")
}