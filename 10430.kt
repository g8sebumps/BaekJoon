fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val remC : (Int) -> (Int) = { it.rem(c) }
    println(remC(a+b))
    println(remC((remC(a).plus(remC(b)))))
    println(remC(a.times(b)))
    println(remC(remC(a).times(remC(b))))
}

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val plus = (a + b) % c;
    val mul = (a * b) % c;
    println("$plus\n$plus\n$mul\n$mul")
}