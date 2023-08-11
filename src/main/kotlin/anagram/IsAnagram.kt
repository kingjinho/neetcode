package anagram

//could not solve on my own
fun isAnagram(s: String, t: String): Boolean {
    val array = IntArray(26)

    for (c in s) {
        array[c - 'a']++
    }

    for (c in t) {
        array[c - 'a']--
    }

    return array.all { it == 0 }

}