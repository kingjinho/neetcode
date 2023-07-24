package anagram

import org.junit.Assert.assertFalse
import org.junit.Test

class IsAnagramKtTest {

    @Test
    fun `isAnagram()_with race and rade_returns false`() {

        assertFalse(isAnagram("race", "rade"))
    }
}