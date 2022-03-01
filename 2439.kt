fun main() {
    val n = readLine()!!.toInt()
    val arr = Array<String>(n) { " " }
    repeat(n) {
        arr[n-1-it] = "*"
        println(arr.joinToString(""))
    }
}

fun main() {
    val length = readLine()!!.toInt()
    for (i in 1..length)
        println("*".repeat(i).padStart(length))
}
