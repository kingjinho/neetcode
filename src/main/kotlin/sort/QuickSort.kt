package sort

fun quickSort(
    arr: IntArray,
    start: Int = 0,
    end: Int = arr.lastIndex
): IntArray {

    if (end - start > 0) {
        val pivotIndex = partition(arr, start, end)
        quickSort(arr, start, pivotIndex - 1)
        quickSort(arr, pivotIndex + 1, end)
    }

    return arr
}

private fun partition(
    arr: IntArray,
    start: Int = 0,
    end: Int = arr.lastIndex
): Int {

    var leftIndex = start

    val pivot = arr[end]
    val rightIndex = end - 1

    for (i in leftIndex..rightIndex) {
        if (arr[i] < pivot) {
            val temp = arr[i]
            arr[i] = arr[leftIndex]
            arr[leftIndex] = temp
            leftIndex++
        }
    }

    val temp = arr[end]
    arr[end] = arr[leftIndex]
    arr[leftIndex] = temp

    return leftIndex
}