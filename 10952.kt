fun main() {
    while (true) {
        when(val value = readLine()?.split(' ')?.map { it.toInt() }?.sum()) {
            0, null -> break
            else -> {
                println(value)
            }
        }
    }
}