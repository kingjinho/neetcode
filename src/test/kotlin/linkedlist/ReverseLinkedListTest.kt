package linkedlist

import org.junit.Assert.*
import org.junit.Test

class ReverseLinkedListTest {

    @Test
    fun `reverseLinkedList() _ 2,1 _ returns 1,2`() {
        val list = ListNode(2)
        list.next = ListNode(1)

        val reversed = reverseLinkedList(list)

        assertTrue(reversed.value == 1)
        assertTrue(reversed.next?.value == 2)
    }

    @Test
    fun `reverseLinkedList() _ 3,2,1 _ returns 1,2,3`() {
        val list = ListNode(3)
        list.next = ListNode(2)
        list.next?.next = ListNode(1)

        val reversed = reverseLinkedList(list)

        assertTrue(reversed.value == 1)
        assertTrue(reversed.next?.value == 2)
        assertTrue(reversed.next?.next?.value == 3)
    }
}