package valid_parentheses

import org.junit.Assert.*
import org.junit.Test

class ValidParenthesesTest {

    @Test
    fun `containsValidParentheses()_with a Rounded Bracket_returns true`() {
        val string = "()"

        val isValid = containsValidParentheses(string)

        assertTrue(isValid)
    }

    @Test
    fun `containsValidParentheses()_with round, box, curly bracket_returns true`() {
        val string = "()[]{}"

        val isValid = containsValidParentheses(string)

        assertTrue(isValid)
    }

    @Test
    fun `containsValidParentheses()_with(}_returns false`() {
        val string = "(]"

        val isValid = containsValidParentheses(string)

        assertFalse(isValid)
    }

    @Test
    fun `containsValidParentheses()_with random incomplete brackets_returns false`() {
        val string = "({})({}}){}(){}{}[]]]]"

        val isValid = containsValidParentheses(string)

        assertFalse(isValid)
    }

    @Test
    fun `containsValidParentheses()_with incomplete box bracket within rounded bracket_returns false`() {
        val string = "(])"

        val isValid = containsValidParentheses(string)

        assertFalse(isValid)
    }
}