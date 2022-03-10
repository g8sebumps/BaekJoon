import kotlin.math.ceil

fun main() {
    val (a, b, V) = readLine()!!.split(' ').map { it.toDouble() }
    val day = ceil((V-a)/(a-b)) + 1
    println("${day.toInt()}")
}
fun main()=print(readLine()!!.split(' ').map{it.toInt()}.let{(a,b,c)->(c-b-1)/(a-b)+1})