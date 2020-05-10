package stack_using_queues

import java.util.ArrayDeque
import java.util.Queue

class MyStack() {

    /** Initialize your data structure here. */
    private val mainQueue: Queue<Int> = ArrayDeque()
    private val removeQueue: Queue<Int> = ArrayDeque()

    /** Push element x onto stack. */
    fun push(x: Int) {
        mainQueue.add(x)
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        fillRemoveQueue()
        val result: Int = mainQueue.poll()
        fillMainQueue()
        return result
    }

    /** Get the top element. */
    fun top(): Int {
        fillRemoveQueue()
        val result: Int = mainQueue.poll()
        removeQueue.add(result)
        fillMainQueue()
        return result
    }

    private fun fillRemoveQueue() {
        while (mainQueue.size > 1) {
            removeQueue.add(mainQueue.poll())
        }
    }

    private fun fillMainQueue() {
        while (removeQueue.isNotEmpty()) {
            mainQueue.add(removeQueue.poll())
        }
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean = mainQueue.isEmpty()

}
