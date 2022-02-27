fun main() {
    val (a, b)=readLine()!!.split(" ").map { it.toInt() }
    val op = when {
        a > b -> ">"
        a < b -> "<"
        else -> "=="
    }
    print(op)
}