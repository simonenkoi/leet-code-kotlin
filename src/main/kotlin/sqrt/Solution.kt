package sqrt

class Solution {
    fun mySqrt(x: Int): Int {
        if (x < 2) return x
        var i = x.toLong()
        while (i * i > x) {
            i = (i + x / i) / 2
        }
        return i.toInt()
    }
}