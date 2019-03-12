package student_attendance_record

class Solution {

    fun checkRecord(s: String): Boolean = !s.contains("L".repeat(3)) && s.containOnlyOnce("A")

    private fun String.containOnlyOnce(s: String): Boolean = indexOf(s) == lastIndexOf(s)
}
