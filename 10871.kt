fun main() {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    val result = readLine()!!.split(' ').filter { it.toInt() < b }
    println(result.joinToString(" "))
}