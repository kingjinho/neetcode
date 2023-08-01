package linkedlist

import org.junit.Assert.*
import org.junit.Test

class MergeSortedListTest {

    @Test
    fun `mergeTwoLists() _ listOf1,2,4 & listOf 1,3,4 _ returns 1,1,2,3,4,4`() {
        val list1 = ListNode(1).also {
            it.next = ListNode(2)
            it.next!!.next = ListNode(4)
        }
        val list2 = ListNode(1).also {
            it.next = ListNode(3)
            it.next!!.next = ListNode(4)
        }

        val merged = mergeTwoLists(list1, list2)

        assertTrue(merged != null)
        assertTrue(merged!!.value == 1)
        assertTrue(merged.next!!.value == 1)
        assertTrue(merged.next!!.next!!.value == 2)
        assertTrue(merged.next!!.next!!.next!!.value == 3)
        assertTrue(merged.next!!.next!!.next!!.next!!.value == 4)
        assertTrue(merged.next!!.next!!.next!!.next!!.next!!.value == 4)

    }
}