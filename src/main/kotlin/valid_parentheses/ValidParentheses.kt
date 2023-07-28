package valid_parentheses

import java.util.ArrayDeque

fun containsValidParentheses(s: String): Boolean {
    val parenthesesStack = ArrayDeque<Char>()

    for (c in s) {
        if(c == '(' || c == '{' || c == '[') {
            parenthesesStack.push(c)
            continue
        }

        if(parenthesesStack.isEmpty()) {
            return false
        }

        val lastElement = parenthesesStack.last()
        if(lastElement == '(' && c == ')' ||
            lastElement == '{' && c == '}' ||
            lastElement == '[' && c == ']') {
            parenthesesStack.pop()
        } else {
            return false
        }
    }

    return parenthesesStack.isEmpty()
}