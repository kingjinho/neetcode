package twosum

fun twoSum(nums: IntArray, target: Int): IntArray {

    val map = mutableMapOf<Int, Int>()

    for ((i, v) in nums.withIndex()) {
        val diff = target - v
        val indexForDiff = map[diff]

        indexForDiff?.let {
            return intArrayOf(indexForDiff, i)
        }

        map[v] = i
    }

    return IntArray(0)
}