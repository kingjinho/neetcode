package productArrayExceptSelf

fun productExceptSelf(nums: IntArray): IntArray {

    val product = IntArray(nums.size)

    product[0] = 1

    for (i in 1..nums.lastIndex) {
        product[i] = product[i - 1] * nums[i - 1]
    }

    var right = 1
    for (i in nums.lastIndex downTo 0) {
        product[i] *= right
        right *= nums[i]
    }

    return product
}