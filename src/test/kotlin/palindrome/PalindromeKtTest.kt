package palindrome

import org.junit.Assert.*
import org.junit.Test

class PalindromeKtTest {

    @Test
    fun `isPalindrome()_withCommas_returns true`() {
        val s = "A man, a plan, a canal: Panama"
        assertTrue(isPalindrome(s))
    }

    @Test
    fun `isPalindrome()_withrace a car_returns false`() {
        val s = "race a car"
        assertFalse(isPalindrome(s))
    }

    @Test
    fun `isPalindrome()_ withEmptyString_returns true`() {
        val s = " "
        assertTrue(isPalindrome(s))
    }

}