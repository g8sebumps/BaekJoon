fun main() {
    val length = readLine()!!.toInt()
    repeat(length) {
        println("*".repeat(it+1))
    }
}