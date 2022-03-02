import kotlin.math.roundToInt

val result: (Array<Int>) -> Int = { arr ->
    val groupMap = arr.groupingBy { it }.eachCount()
    val max = groupMap.maxOf { it.value }
    val maxMap = groupMap.filter { it.value == max }
    maxMap.keys.sortedBy { it }.let {
        if (it.size == 1) it.first() else it[1]
    }
}

fun main() {
    val size = readLine()!!.toInt()
    val arr = Array<Int>(size) { 0 }
    repeat(size) { idx ->
        arr[idx] = readLine()!!.toInt()
    }
    arr.sort()
    println(arr.average().roundToInt())
    println(arr[size/2])
    println(result(arr))
    println(arr[size-1] - arr[0])
}

fun main() {
    val n = readLine()!!.toInt()
    val inputs = (1..n).map { readLine()!!.toInt() }.sorted()
    println(inputs.average().roundToInt())
    println(inputs[n / 2])
    println(
        inputs
            .groupingBy { it }
            .eachCount()
            .entries
            .groupBy({ it.value }, { it.key })
            .entries
            .maxByOrNull { it.key }!!
            .value
            .sorted()
            .take(2)
            .last()
    )
    println(inputs.last() - inputs.first())
}