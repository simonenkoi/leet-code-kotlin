package sum_of_two_integers

class Solution {
    fun getSum(a: Int, b: Int): Int {
        return if (b == 0) a else getSum(a xor b, a and b shl 1)
    }
}