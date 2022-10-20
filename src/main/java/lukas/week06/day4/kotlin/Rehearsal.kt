package lukas.week06.day4.kotlin

import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main() {
    val arr = IntArray(1000000)
    val random = Random()
    for (i in arr.indices) {
        arr[i] = random.nextInt()
    }
    val statistics = getMinMaxAvg(arr)
    println(statistics.min)
    println(statistics.max)
    println(statistics.max)
    println(statistics.toString())
}

private fun getMinMaxAvg(arr: IntArray): ArrayStatistics {
    var min = arr[0]
    var max = arr[0]
    var sum = 0.0
    for (value in arr) {
//            if (min > value) {
//                min = value;
//            }
//            if (max < value) {
//                max = value;
//            }
        min = min(min, value)
        max = max(max, value)
        sum += value.toDouble()
    }
    val avg = sum / arr.size
    return ArrayStatistics(max, min, avg)
}

class ArrayStatistics(val max: Int = 0, val min: Int = 0, val avg: Double = 0.0) {
    override fun toString(): String {
        return """
               Minimum: $min
               Maximum: $max
               Average: $avg
               ${super.toString()}
               """.trimIndent()
    }
}