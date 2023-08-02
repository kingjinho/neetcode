package linkedlist

import java.util.Stack

fun reverseLinkedList(list: ListNode): ListNode {

    var curr: ListNode? = list
    var prev: ListNode? = null

    while (curr != null) {
        val next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }

    return prev!!
}

fun reverseLinkedListRecur(curr: ListNode?, head: ListNode? = null): ListNode? {
    return if (curr != null) {
        val tmpHead = ListNode(curr.value)
        tmpHead.next = head
        reverseLinkedListRecur(curr.next, tmpHead)
    } else {
        head
    }
}

fun reverseLinkedListStack(head: ListNode): ListNode {
    val stack = Stack<ListNode>()
    var node: ListNode? = head
    while (node != null) {
        val next = node.next
        node.next = null
        stack.push(node)

        node = next
    }

    val reversed = stack.pop()
    var new = reversed
    while (stack.isNotEmpty()) {
        new.next = stack.pop()
        new = new.next
    }

    return reversed
}
