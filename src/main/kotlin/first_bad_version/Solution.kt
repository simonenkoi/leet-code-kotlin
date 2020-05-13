package first_bad_version

class Solution : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        var start = 1
        var end: Int = n
        while (start < end) {
            val mid: Int = getMidPointWithOverflow(start, end)
            if (isBadVersion(mid)) {
                end = mid
            } else {
                start = mid + 1
            }
        }
        return start
    }

    private fun getMidPointWithOverflow(start: Int, end: Int): Int = start + (end - start) / 2
}