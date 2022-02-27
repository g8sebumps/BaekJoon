fun main() {
    val result = when(readLine()!!.toInt()) {
        in 90..100 -> "A"
        in 80 until 90 -> "B"
        in 70 until 80 -> "C"
        in 60 until 70 -> "D"
        else -> "F"
    }
    println(result)
}