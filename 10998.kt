fun main() {
    val result = readLine()!!.split(' ').map { it.toInt() }.reduce { a, b -> a.times(b) }
    print(result)
}