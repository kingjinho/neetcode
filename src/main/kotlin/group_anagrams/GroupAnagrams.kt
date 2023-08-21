package group_anagrams

fun groupAnagrams(strs: Array<String>): List<List<String>> {

    return if (strs.size == 1) {
        listOf(listOf(strs[0]))
    } else {
        val map = mutableMapOf<String, MutableList<String>>()

        for (s in strs) {
            if (map.isEmpty()) {
                map[s] = mutableListOf(s)
            } else {
                var containsNoAnagram = true
                for (key in map.keys) {
                    if (isAnagram(s, key)) {
                        containsNoAnagram = false
                        val list = map[key]!!
                        list.add(s)
                        break
                    }
                }
                if (containsNoAnagram) {
                    map[s] = mutableListOf(s)
                }
            }
        }

        map.map {
            it.value.toList()
        }
    }
}

fun isAnagram(s: String, t: String): Boolean {
    val arr = IntArray(26)

    for (c in s) {
        arr[c - 'a']++
    }

    for (c in t) {
        arr[c - 'a']--
    }

    return arr.all { it == 0 }
}

fun groupAnagramsByOthers(strs: Array<String>): List<List<String>> {
    val groupBy = strs.groupBy { it.toCharArray().sorted() }
    return groupBy.map { it.value }
}