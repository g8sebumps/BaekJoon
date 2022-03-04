fun main() {
    var a = 1
    repeat(3) {
        a = a.times(readLine()!!.toInt())
    }
    val arr = IntArray(10) { 0 }
    while (a > 0) {
        arr[a%10]++
        a /= 10
    }
    repeat(10) { idx ->
        println(arr[idx])
    }
}

fun main() {
    val a = List(3) { readLine()!!.toInt() }
            .reduce { t, n -> t * n }.toString();
    repeat(10) { println(a.count { c -> "$c" == "$it" }) }
}