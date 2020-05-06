package min_stack

import kotlin.math.min

class MinStack() {

    private val elements: MutableList<Int> = ArrayList()
    private val minimums: MutableList<Int>  = ArrayList()

    fun push(x: Int) {
        elements.add(x)
        minimums.add(if (minimums.isNotEmpty()) min(x, minimums.last()) else x)
    }

    fun pop() {
        elements.removeLast()
        minimums.removeLast()
    }

    fun top(): Int = elements.last()

    fun getMin(): Int = minimums.last()
}

private fun <E> MutableList<E>.removeLast() {
    this.removeAt(this.lastIndex)
}