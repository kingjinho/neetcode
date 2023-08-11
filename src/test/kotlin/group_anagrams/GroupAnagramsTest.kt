package group_anagrams

import org.junit.Assert.assertTrue
import org.junit.Test

class GroupAnagramsTest {


    @Test
    fun `group anagrams _ with "eat","tea","tan","ate","nat","bat" returns (("eat","tea","ate"), ("tan","nat"), ("bat))`() {

        val strings = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

        val result = groupAnagrams(strings)

        assertTrue(result[0].containsAll(listOf("eat", "tea", "ate")))
    }

    @Test
    fun `test _ with 2 empty strings _ returns list of list of 2 empty strings`() {

        val strings = arrayOf("", "")

        val result = groupAnagrams(strings)

        assertTrue(result[0].containsAll(listOf("", "")))
    }
}