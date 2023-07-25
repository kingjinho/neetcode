package twosum

import org.junit.Assert.*
import org.junit.Test

class TwoSumKtTest {

    @Test
    fun `twoSumOf 9_with_1,2,3,4,5_returns intArrayOf 3,4`() {
        val intArray = intArrayOf(1,2,3,4,5)

        val twoSumsArray = twoSum(intArray, 9)

        assertArrayEquals(twoSumsArray, intArrayOf(3,4))
    }

    @Test
    fun `twoSumOf 8_with_1,2,3,4,5_returns intArrayOf 2,4`() {
        val intArray = intArrayOf(1,2,3,4,5)

        val twoSumsArray = twoSum(intArray, 8)

        assertArrayEquals(twoSumsArray, intArrayOf(2,4))
    }

    @Test
    fun `twoSumOf 10_with_1,2,3,4,5_returns empty array`() {
        val intArray = intArrayOf(1,2,3,4,5)

        val twoSumsArray = twoSum(intArray, 10)

        assertTrue(twoSumsArray.isEmpty())
    }
}