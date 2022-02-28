fun main() {
    var a = readLine()!!.toInt()
    (1..9).forEach {
        println("$a * $it = ${a.times(it)}")
    }
}