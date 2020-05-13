package first_bad_version

abstract class VersionControl {

    fun isBadVersion(version: Int): Boolean {
        TODO("STUB")
    }

    abstract fun firstBadVersion(n: Int) : Int
}