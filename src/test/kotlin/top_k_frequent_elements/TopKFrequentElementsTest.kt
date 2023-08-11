package top_k_frequent_elements

import org.junit.Assert.assertTrue
import org.junit.Test

class TopKFrequentElementsTest {


    @Test
    fun `topKFrequent() _ with array of (1,1,1,2,2,3) k is 2_ returns (1, 2)`() {
        val arr = intArrayOf(1, 1, 1, 2, 2, 3)

        val topK = topKFrequentByOthers(arr, 2)

        assertTrue(topK.contentEquals(intArrayOf(1, 2)))
    }

    @Test
    fun `topKFrequent() _ with array of (1) and k is 1 _ returns (1)`() {
        val arr = intArrayOf(1)

        val topK = topKFrequentByOthers(arr, 1)

        assertTrue(topK.contentEquals(intArrayOf(1)))
    }

    @Test
    fun `topKFrequent() _ with array of (1,2) and k is 2 _ returns (1,2)`() {
        val arr = intArrayOf(1, 2)

        val topK = topKFrequentByOthers(arr, 2)

        assertTrue(topK.contentEquals(intArrayOf(1, 2)))
    }
}