fun rearrangeArray(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var pos = 0
    var neg = 1 // positives fill even slots, negatives fill odd slots

    for (num in nums) {
        if (num > 0) {
            result[pos] = num
            pos += 2
        } else {
            result[neg] = num
            neg += 2
        }
    }
    return result
}

fun main() {
    println(rearrangeArray(intArrayOf(3, 1, -2, -5, 2, -4)).toList()) // [3, -2, 1, -5, 2, -4]
    println(rearrangeArray(intArrayOf(-1, 1)).toList())               // [1, -1]
    println(rearrangeArray(intArrayOf(1, 2, -1, -2)).toList())        // [1, -1, 2, -2]
}
