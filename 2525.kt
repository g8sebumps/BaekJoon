import java.util.*
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(' ').map { it.toInt() }
    val time = br.readLine().toInt()
    val v = time.div(60)
    val r = time.rem(60)
    var hour = a + v
    var min = b + r
    if (min > 59) {
        min -= 60
        hour++
    }
    if (hour > 23) {
        hour -= 24
    }
    hour += (b+r).div(60)
    if (hour >= 24) hour = hour.div(25)
    hour += (b+r).div(60)
    val min = (b+r).rem(60)

    println("a=$hour, b=$min")
}


fun main(args: Array<String>) {
    val (a,b)=readLine()!!.split(" ").map{it.toInt()}
    val c =readLine()!!.toInt()
    val t = (60*a+b+c)%(24*60)
    println("${t / 60} ${t % 60}")
}