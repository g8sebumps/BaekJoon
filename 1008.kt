fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(' ').map { it.toDouble() }
    print(a/b)
}

fun main(){
    val (a,b) = readLine()!!.split(' ').map(String::toDouble)
    println(a/b)
}