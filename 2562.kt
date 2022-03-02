fun main() {
    var max = 0
    var idx = 0
    repeat(9) { i ->
        val value = readLine()!!.toInt()
        if (max < value) {
            max = value
            idx = i+1
        }
    }
    println(max)
    println(idx)
}

fun main() {
    print( 
        List(9) {readLine()!!.toInt() }.run{
            val m = maxOf{it};"$m\n${indexOf(m)+1}"
        }
    )   
}
