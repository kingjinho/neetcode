package long_consecutive


fun longestConsecutive(nums: IntArray): Int {
    return if (nums.isEmpty()) {
        0
    } else {
        val numsCopy = nums.sortedArray()

        val list = mutableListOf<MutableList<Int>>()

        var prev: Int? = null
        for (num in numsCopy) {
            val element = list.find {
                it.any { value ->
                    value == num - 1
                }
            } ?: mutableListOf()

            if (prev == null) {
                list.add(element)
                element.add(num)
                prev = num
            } else if (prev + 1 == num) {
                element.add(num)
                prev = num
            } else if (prev != num) {
                list.add(element)
                element.add(num)
                prev = num
            }
        }

        list.maxOf {
            it.size
        }
    }

}

fun longestConsecutiveOther1(nums: IntArray): Int {
    val set = nums.toSet()
    var longest = 0

    for (currentNum in set) {
        if (set.contains(currentNum - 1)) {
            continue
        }
        var incremented = currentNum + 1
        while (set.contains(incremented)) {
            incremented++
        }
        longest = Math.max(longest, incremented - currentNum)
    }

    return longest
}

fun longestConsecutiveOther2(num: IntArray): Int {
    val m = HashMap<Int, Int>()
    var r = 0
    for (i in num) {
        if (m.containsKey(i)) {
            continue
        }
        val left = m.getOrDefault(i - 1, 0)
        val right = m.getOrDefault(i + 1, 0)
        val length = left + right + 1

        r = Math.max(r, length)

        m[i] = length
        m[i - left] = length
        m[i + right] = length
    }

    return r
}