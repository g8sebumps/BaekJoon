fun main() {
    val length = readLine()!!.toInt()
    repeat(length) { idx ->
        println("Case #${idx+1}: ${readLine()!!.split(' ').map { it.toInt() }.sum()}")
    }
}

fun main()=repeat(readln().toInt()){println("Case #${it+1}: ${readln().sumOf{it-' '}-32}")}