package add_binary

class Solution {
    fun addBinary(a: String, b: String): String {
        var i = a.lastIndex
        var j = b.lastIndex
        var sum = 0
        val result = StringBuilder()
        while (i >= 0 || j >= 0) {
            if (i >= 0) sum += a[i--] - '0'
            if (j >= 0) sum += b[j--] - '0'
            result.append(if (sum > 1) sum % 2 else sum)
            sum /= 2
        }
        if (sum != 0) result.append(sum)
        return result.reverse().toString()
    }
}