package top_k_frequent_elements

fun topKFrequent(nums: IntArray, k: Int): IntArray {


    val map = mutableMapOf<Int, Int>()

    for (num in nums) {
        if (!map.containsKey(num)) {
            map[num] = 1
        } else {
            map[num] = map[num]!! + 1
        }
    }

    return map.map {
        Pair(it.key, it.value)
    }.sortedByDescending {
        it.second
    }.take(k).map {
        it.first
    }.toIntArray()

}

fun topKFrequentByOthers(nums: IntArray, k: Int): IntArray {

    val map = nums
        .toList()
        .groupingBy { it }
        .eachCount()

    return map.toList()
        .sortedByDescending { it.second }
        .take(2)
        .map {
            it.first
        }.toIntArray()

}