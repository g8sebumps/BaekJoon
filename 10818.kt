fun main() {
    val size = readLine()!!.toInt()
    val nums = readLine()!!.split(' ').map { it.toInt() }.toSet()
    print("${nums.minOrNull()} ${nums.maxOrNull()}")
}

fun main() {
    readLine()
    readLine()!!.split(" ").map{it.toInt()}.run{
        println("${min()!!} ${max()!!}")
    }
}