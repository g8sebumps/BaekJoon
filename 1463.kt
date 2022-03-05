import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(n + 1)
    for (i in 2..n) {
        dp[i] = dp[i - 1] + 1
        if (i % 2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1)
        if (i % 3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1)
    }
    println(dp[n])
}
fun main()=print(r(readLine()!!.toInt()))
fun r(n:Int):Int=if(n<2)0 else minOf(r(n/2)+n%2,r(n/3)+n%3)+1