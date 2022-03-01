fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println(b.rem(10).times(a))
    println((b.rem(100).div(10)).times(a))
    println(b.div(100).times(a))
    println(a.times(b))
}