package linkedlist

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    var curList1 = list1
    var curList2 = list2
    val merged = ListNode(0)
    var current = merged

    while (true) {

        val value1 = curList1?.value ?: Int.MAX_VALUE
        val value2 = curList2?.value ?: Int.MAX_VALUE

        val new = ListNode(value1.coerceAtMost(value2))

        current.next = new

        current = current.next!!

        if(value1 >= value2) {
            curList2 = curList2?.next
        } else {
            curList1 = curList1?.next
        }

        if(curList1 == null && curList2 == null) {
            break
        }
    }

    return merged.next
}