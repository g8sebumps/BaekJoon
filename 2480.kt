import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val list = br.readLine().split(' ').map { it.toInt() }.toList().sorted()
    val set = list.toSet()

    val result = when (set.size) {
        1 -> 10000+(set.first()*1000)
        2 -> 1000+(list[1]*100)
        else -> list[2]*100
    }
    println(result)

}


fun main() =
    readLine()!!.split(" ").map { it.toInt() }.let { it ->
        print(
            when (it.toSet().size) {
                1 -> 10000 + it.maxOf { max -> max } * 1000
                2 -> 1000 + it.groupingBy { it }.eachCount().filterValues { it == 2 }.map { it.key }[0] * 100
                else -> it.maxOf { max -> max } * 100
            })
    }