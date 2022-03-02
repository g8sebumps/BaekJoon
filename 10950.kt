fun main() {
    repeat(readLine()!!.toInt()) { idx ->
        println(readLine()!!.split(' ').map { it.toInt() }.sum())
    }
}