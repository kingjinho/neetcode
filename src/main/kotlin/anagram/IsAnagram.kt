package anagram

//could not solve on my own
fun isAnagram(s: String, t: String): Boolean {
    val charArray = IntArray(26)
    for (c in s) {
        charArray[c - 'a']++
    }

    for (c in t) {
        charArray[c - 'a']--
    }

    for(i in charArray) {
        if(i != 0) {
            return false
        }
    }
    return true
}