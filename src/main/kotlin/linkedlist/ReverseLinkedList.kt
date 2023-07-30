package linkedlist

import java.util.LinkedList

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
