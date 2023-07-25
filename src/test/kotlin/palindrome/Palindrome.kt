package palindrome

fun isPalindrome(s: String): Boolean {
    val modified = s.lowercase()
        .replace(Regex("[^a-z]"), "")
        .trim()

    return if (modified.isEmpty()) {
        true
    } else {
        var isPalindrome = true
        for (i in 0..modified.lastIndex / 2) {
            if(modified[i] != modified[modified.lastIndex - i]) {
                isPalindrome = false
                break
            }
        }
        isPalindrome
    }
}