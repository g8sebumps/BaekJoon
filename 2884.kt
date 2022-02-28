fun main() {
    var (h, m) = readLine()!!.split(" ").map { it.toInt() }
    if (m < 45) {
        if (h == 0) h = 24
        h -= 1
        m = m+60-45
    }else {
        m -= 45
    }
    println("$h $m")
}

fun main(){
    val (h, m) = readln().split(" ").map{ it.toInt() }
    val clock = ((h*60+m) - 45 + 1440) % 1440
    print("${clock/60} ${clock%60}")
}