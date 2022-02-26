import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    println(br.readLine().split(' ').map { it.toInt() }.sum())
}

fun main() {
    println(readLine()!!.split(' ').sumOf { it.toInt() })
}