fun main() {
    var value = readLine()!!.toInt()
    val tmp = value
    var count = 0
    do {
        value = value.rem(10).times(10) + (value.div(10)+value.rem(10)).rem(10)
        count++
    } while (tmp != value)
    println(count)
}