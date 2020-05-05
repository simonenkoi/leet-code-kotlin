package pascal_triangle

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val triangle = mutableListOf<MutableList<Int>>()
        for (i in 0 until numRows) {
            triangle.add(MutableList(i + 1) { if (it == 0 || it == i) 1 else 0 })
            for (j in 1 until i) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
            }
        }
        return triangle
    }
}