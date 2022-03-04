fun main() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    val result = when {
        x.times(y) > 0 && x > 0 -> 1
        x.times(y) < 0 && x < 0 -> 2
        x.times(y) > 0 && x < 0 -> 3
        x.times(y) < 0 && x > 0 -> 4
        else -> 0
    }
    print(result)
}

fun main() {
    val (a, b) = List(2) { if (readln()[0] == '-') 1 else 0 }
    print(if(a==0&&b==1)4 else 1+a+b)
}