fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))
}