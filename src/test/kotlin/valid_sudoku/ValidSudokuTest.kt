package valid_sudoku

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ValidSudokuTest {

    @Test
    fun `isValidSudoku _ with given input _ returns valid sudoku`() {
        val arr = arrayOf(
            arrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.').toCharArray(),
            arrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.').toCharArray(),
            arrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.').toCharArray(),
            arrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3').toCharArray(),
            arrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1').toCharArray(),
            arrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6').toCharArray(),
            arrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.').toCharArray(),
            arrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5').toCharArray(),
            arrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9').toCharArray()
        )

        val isValidSudoku = isValidSudokuByOthers(arr)

        assertTrue(isValidSudoku)
    }

    @Test
    fun `isValidSudoku _ with given input _ returns invalid sudoku`() {
        val arr = arrayOf(
            arrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.').toCharArray(),
            arrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.').toCharArray(),
            arrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.').toCharArray(),
            arrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3').toCharArray(),
            arrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1').toCharArray(),
            arrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6').toCharArray(),
            arrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.').toCharArray(),
            arrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5').toCharArray(),
            arrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9').toCharArray()
        )

        val isValidSudoku = isValidSudokuByOthers(arr)

        assertFalse(isValidSudoku)
    }

    @Test
    fun `isValidSudoku _ with given input _ returns invalid sudoku 2`() {
        val arr = arrayOf(
            arrayOf('.', '.', '.', '.', '5', '.', '.', '1', '.').toCharArray(),
            arrayOf('.', '4', '.', '3', '.', '.', '.', '.', '.').toCharArray(),
            arrayOf('.', '.', '.', '.', '.', '3', '.', '.', '1').toCharArray(),
            arrayOf('8', '.', '.', '.', '.', '.', '.', '2', '.').toCharArray(),
            arrayOf('.', '.', '2', '.', '7', '.', '.', '.', '.').toCharArray(),
            arrayOf('.', '1', '5', '.', '.', '.', '.', '.', '.').toCharArray(),
            arrayOf('.', '.', '.', '.', '.', '2', '.', '.', '.').toCharArray(),
            arrayOf('.', '2', '.', '9', '.', '.', '.', '.', '.').toCharArray(),
            arrayOf('.', '.', '4', '.', '.', '.', '.', '.', '.').toCharArray()
        )

        val isValidSudoku = isValidSudokuByOthers(arr)

        assertFalse(isValidSudoku)
    }
}