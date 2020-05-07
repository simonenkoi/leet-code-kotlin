package excel_sheet_column_title

class Solution {
    fun convertToTitle(n: Int): String {
        val result = StringBuilder()
        val aValue: Int = 'A'.toInt()
        var nCopy: Int = n
        while (nCopy != 0) {
            result.append(((nCopy - 1) % 26 + aValue).toChar())
            nCopy = (nCopy - 1) / 26
        }
        return result.reverse().toString()
    }
}