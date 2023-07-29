package binary_search

import org.junit.Assert.*
import org.junit.Test

class BinarySearchTest {

    @Test
    fun `binarySearch()_in a given array to find index of 9_returns 4`() {
        val array = intArrayOf(-1,0,3,5,9,12)

        val indexOfNine = binarySearch(array, 9)

        assertTrue(indexOfNine == 4)
    }

    @Test
    fun `binarySearch()_in a given array to find index of 2_returns -1`() {
        val array = intArrayOf(-1,0,3,5,9,12)

        val indexOfNine = binarySearch(array, 2)

        assertTrue(indexOfNine == -1)
    }

    @Test
    fun `binarySearch()_in a given array to find index of 0_returns -1`() {
        val array = intArrayOf(2,5)

        val indexOfNine = binarySearch(array, 0)

        assertTrue(indexOfNine == -1)
    }
}