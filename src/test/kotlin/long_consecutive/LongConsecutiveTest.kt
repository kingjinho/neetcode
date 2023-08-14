package long_consecutive

import org.junit.Assert.assertTrue
import org.junit.Test

class LongConsecutiveTest {


    @Test
    fun `longestConsecutive() _ with given array of 100, 4, 200, 1, 3, 2 _ returns 4`() {
        val arr = intArrayOf(100, 4, 200, 1, 3, 2)

        val longestConsecutive = longestConsecutive(arr)

        assertTrue(longestConsecutive == 4)
    }

    @Test
    fun `longestConsecutive() _ with given array of 0,3,7,2,5,8,4,6,0,1 _ returns 9`() {
        val arr = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)

        val longestConsecutive = longestConsecutiveOther2(arr)

        assertTrue(longestConsecutive == 9)
    }

    @Test
    fun `longestConsecutive() _ with given empty array _ returns 0`() {
        val arr = intArrayOf()

        val longestConsecutive = longestConsecutive(arr)

        assertTrue(longestConsecutive == 0)
    }

    @Test
    fun `longestConsecutive() _ with given array 0, 0, -1 _ returns 2`() {
        val arr = intArrayOf(0, 0, -1)

        val longestConsecutive = longestConsecutiveOther2(arr)

        assertTrue(longestConsecutive == 2)
    }
}