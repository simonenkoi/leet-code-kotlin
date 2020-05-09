package isomorphic_string

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = HashMap<Char, Char>()
        for (i: Int in s.indices) {
            if (map.containsKey(s[i])) {
                if (map[s[i]] != t[i]) {
                    return false
                }
            } else if (map.containsValue(t[i])) {
                return false
            }

            map[s[i]] = t[i]
        }
        return true
    }
}