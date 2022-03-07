import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${StringTokenizer(br.readLine()).countTokens()}")
    bw.flush()

    br.close()
    bw.close()
}

fun main()=print(readLine()!!.split(' ').count{it!=""})
