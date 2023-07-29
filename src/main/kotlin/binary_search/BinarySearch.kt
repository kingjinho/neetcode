package binary_search

fun binarySearch(intArray: IntArray, target: Int): Int {
    return binarySearch(intArray, 0, intArray.lastIndex, target)
}

fun binarySearch(intArray: IntArray, start: Int, end: Int, target: Int): Int {
    val mid = (start + end) / 2
    val midValue = intArray[mid]

    return if (start > end) {
        -1
    } else if (midValue == target) {
        mid
    } else if (midValue > target) {
        binarySearch(intArray, start, mid - 1, target)
    } else {
        binarySearch(intArray, mid + 1, end, target)
    }
}