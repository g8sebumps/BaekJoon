fun main() {
    var a = readLine()!!.toInt()
    val result = when {
        a.rem(400) == 0 -> 1
        a.rem(4) == 0 && a.rem(100) > 0 -> 1
        else -> 0
    }
    print(result)
}

fun main(args: Array<String>){
    val n= readLine()!!.toInt()
    println(if(n%4==0&&(n%100!=0||n%400==0)) 1 else 0)
}
