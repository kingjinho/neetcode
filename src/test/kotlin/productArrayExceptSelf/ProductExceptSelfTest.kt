package productArrayExceptSelf

import org.junit.Assert.assertTrue
import org.junit.Test

class ProductExceptSelfTest {


    @Test
    fun `productExceptSelf _ with array of 1,2,3,4 _ returns 24,12,8,6`() {
        val arr = intArrayOf(1, 2, 3, 4)

        val product = productExceptSelf(arr)

        assertTrue(product.contentEquals(intArrayOf(24, 12, 8, 6)))
    }

    @Test
    fun `productExceptSelf _ with array of -1,1,0,-3,3 _ returns 0,0,9,0,0`() {
        val arr = intArrayOf(-1, 1, 0, -3, 3)

        val product = productExceptSelf(arr)

        assertTrue(product.contentEquals(intArrayOf(0, 0, 9, 0, 0)))
    }

}