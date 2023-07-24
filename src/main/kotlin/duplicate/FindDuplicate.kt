package duplicate

fun findDuplicate(array: IntArray): Boolean {
    val duplicate = mutableSetOf<Int>()
    for (i in array) {
        if(duplicate.contains(i)) {
            return true
        }
        duplicate.add(i)
    }
    return false
}