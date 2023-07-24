package duplicate

import org.junit.Assert.*
import org.junit.Test

class FindDuplicateKtTest {

    @Test
    fun `find duplicate_withArray1,2,4,5,6_returns false`() {
        assertFalse(findDuplicate(array = intArrayOf(1, 2, 3, 4, 5, 6)))
    }

    @Test
    fun `find duplicate_withArray1,2,4,5,6,4_returns false`() {
        assertTrue(findDuplicate(array = intArrayOf(1, 2, 3, 4, 5, 6, 4)))
    }

}