package sort

import org.junit.Assert.assertTrue
import org.junit.Test

class QuickSortTest {


    @Test
    fun `quickSort() _ with IntArray of 6,5,8,9,1 _ returns 1,5,6,8,9`() {
        val intArray = intArrayOf(6, 5, 8, 9, 1)

        val sorted = quickSort(intArray)

        assertTrue(sorted.contentEquals(intArrayOf(1, 5, 6, 8, 9)))

    }
}