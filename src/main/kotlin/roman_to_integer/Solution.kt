package roman_to_integer

class Solution {
    companion object {
        val DICTIONARY: Map<Char, Int> = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
    }

    fun romanToInt(s: String): Int {
        var result = 0
        for (i: Int in s.length downTo 1) {
            val previousCharValue = DICTIONARY.getValue(s[i - 1])
            if (i < s.length && previousCharValue < DICTIONARY.getValue(s[i])) {
                result -= previousCharValue
            } else {
                result += previousCharValue
            }
        }
        return result
    }
}