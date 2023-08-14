package valid_sudoku

fun isValidSudoku(board: Array<CharArray>): Boolean {
    return isValidInColumn(board) && isValidInRow(board) && isValidInBox(board)
}

fun isValidInColumn(board: Array<CharArray>): Boolean {
    for (chars in board) {
        val set = mutableSetOf<Char>()
        for (char in chars) {
            if (char != '.' && set.contains(char)) {
                return false
            } else {
                set.add(char)
            }
        }
    }
    return true
}

fun isValidInRow(board: Array<CharArray>): Boolean {
    for (i in board.indices) {
        val row = board.map {
            it[i]
        }
        val set = mutableSetOf<Char>()
        for (char in row) {
            if (char != '.' && set.contains(char)) {
                return false
            } else {
                set.add(char)
            }
        }
    }
    return true
}

fun isValidInBox(board: Array<CharArray>): Boolean {
    var x = 0
    var y = 0
    var result = true

    while (x <= 6 && y <= 6 && result) {
        val set = mutableSetOf<Char>()
        for (i in x..x + 2) {
            for (j in y..y + 2) {
                if (board[i][j] != '.' && set.contains(board[i][j])) {
                    result = false
                    break
                } else {
                    set.add(board[i][j])
                }
            }
        }

        if (y == 6) {
            y = 0
            x += 3
        } else {
            y += 3
        }
    }

    return result
}

fun isValidSudokuByOthers(board: Array<CharArray>): Boolean {
    val rowRecord = Array(9) {
        mutableSetOf<Char>()
    }
    val columnRecord = Array(9) {
        mutableSetOf<Char>()
    }
    val subBoxRecord = Array(9) {
        mutableSetOf<Char>()
    }

    board.forEachIndexed { rowIndex, chars ->
        chars.forEachIndexed { columnIndex, c ->
            if (c in '1'..'9') {

                val subBoxIndex = rowIndex / 3 * 3 + columnIndex / 3

                if (!rowRecord[rowIndex].add(c)
                    || !columnRecord[columnIndex].add(c)
                    || !subBoxRecord[subBoxIndex].add(c)
                ) {
                    return false
                }
            }
        }
    }

    return true
}